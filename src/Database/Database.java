package Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author kjvdlelij
 */
public class Database {

    private static String dbserver;
    private static String database;
    private static String username;
    private static String password;
    
    public static Connection con = null;
    public static Statement stmt = null;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;

    private static Connection activeConn;

    /**
     * Initializes the data source. Checks if MySQL Driver is found contains the
     * database driver, Fill variabels dbserver, database, username, and
     * password
     *
     * TODO get variabels from a configuration file!!! or credentials manager
     * Hardcoded is bad code!!!
     */
    private static void init() {

        Scanner in = null;

        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        
        dbserver = "meru.hhs.nl";
        database = "16102150";
        username = "16102150";
        password = "Voutiez4Ej";
    }

    /**
     * Gets a connection to the database.
     *
     * @return the database connection
     */
    public static Connection getConnection() throws SQLException, IOException {

        if (activeConn == null) {
            init();
            activeConn = createConnection();
        } else if (!activeConn.isValid(0)) {
            activeConn = createConnection();
        }

        return activeConn;
    }

    private static Connection createConnection() throws SQLException {

        String connectionString = "jdbc:mysql://" + dbserver + ":3306/" + database + "?"
                + "user=" + username + "&password=" + password;

        return DriverManager.getConnection(connectionString);
    }

    public static void closeConnection() {

        if (activeConn != null) {

            try {
                activeConn.close();
            } catch (SQLException e) {
                //to catch and do nothing is the best option
                //don't know how to recover from this exception

            } finally {
                activeConn = null;
            }
        }
    }
}

