
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
public class SQLmanagement {
    
    public static void WeergevenGegevensManage() throws SQLException, IOException {
        PreparedStatement pst = null;
        String query = "SELECT uitgiftepunt, sum(aantalpakketten) AS aantal from voedselpakket group by uitgiftepunt";
        Connection conn = Database.Database.getConnection();
        pst = conn.prepareStatement(query);
        ResultSet result = pst.executeQuery(query);
        Main.tblManageInfo.setModel(DbUtils.resultSetToTableModel(result));
    }
}
