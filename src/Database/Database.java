package Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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

        dbserver = "Localhost";
        database = "Voedselbank";
        username = "root";
        password = "root";
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

        // return DriverManager.getConnection("academie", "blok1", "academie");
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
