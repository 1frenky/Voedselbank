
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
public class SQLclientOverzicht {
    
    public static void WeergevenGegevensClient() throws SQLException, IOException {
        PreparedStatement pst = null;
        String query = "SELECT * FROM `16102150`.client";
        Connection conn = Database.Database.getConnection();
        pst = conn.prepareStatement(query);
        ResultSet result = pst.executeQuery(query);
        Main.tblClientGegevens.setModel(DbUtils.resultSetToTableModel(result));
    }
}
