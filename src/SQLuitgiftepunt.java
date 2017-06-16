
import java.io.IOException;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justi
 */
public class SQLuitgiftepunt extends Database.Database{
    
    public static void WeergevenGegevensUitgifte() throws SQLException, IOException {
        PreparedStatement pst = null;
        String query = "SELECT * FROM `16102150`.uitgiftepunt";
        Connection conn = Database.Database.getConnection();
        pst = conn.prepareStatement(query);
        ResultSet result = pst.executeQuery(query);
        Main.tblUitgifteLijst.setModel(DbUtils.resultSetToTableModel(result));
    }
    
    public static void VerwijdergegevensUitgifte() throws SQLException, IOException {

        PreparedStatement pst = null;

        String query = "DELETE FROM `16102150`.uitgiftepunt";
        Connection conn = Database.Database.getConnection();
        pst = conn.prepareStatement(query);
        pst.executeUpdate();
        //Main.tblUitgifteLijst.setModel(DbUtils.resultSetToTableModel(rs));  
    }
}
