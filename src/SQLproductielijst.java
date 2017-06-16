
import java.awt.event.*;
import java.io.IOException;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.text.BadLocationException;
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
public class SQLproductielijst {

    public static void WeergevenGegevensProd() throws SQLException, IOException {
        PreparedStatement pst = null;
        String query = "SELECT uitgiftepunt Uitgiftepunt, MAX(datum) Datum, sum(aantalPakketten) 'Aantal Pakketten', volgordeLijst Volgorde FROM `16102150`.voedselpakket "
                + "JOIN `16102150`.uitgiftepunt "
                + "ON Uitgiftepunt = uitgifteNaam "
                + "GROUP BY Uitgiftepunt "
                + "ORDER BY volgordeLijst ASC";
        Connection conn = Database.Database.getConnection();
        pst = conn.prepareStatement(query);
        ResultSet result = pst.executeQuery(query);
        Main.tblProdLijst.setModel(DbUtils.resultSetToTableModel(result));
    }

    public static void OphalenLocatie() {
        Main.tblProdLijst.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                if (e.getClickCount() == 1) {
                    final JTable jTable = (JTable) e.getSource();
                    final int row = jTable.getSelectedRow();
                    final int column = jTable.getSelectedColumn();
                    final int cellwaarde1 = (int) jTable.getValueAt(row, column);
                    String cellwaarde = "" + cellwaarde1;
                    Main.jtxtProdVolgorde.setText(cellwaarde);
                }
            }
        });
    }

    public static void OphalenUitgitenaam() {
        Main.tblProdLijst.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                if (e.getClickCount() == 1) {
                    final JTable jTable = (JTable) e.getSource();
                    final int row = jTable.getSelectedRow();
                    final int column = 0;
                    final String cellwaarde1 = (String) jTable.getValueAt(row, column);
                    String cellwaarde = "" + cellwaarde1;
                    Main.jlblProdNaam.setText(cellwaarde);
                }
            }
        });
    }

    public static void SorterenProdlijst() throws SQLException, IOException, BadLocationException {
        String locatie = Main.jtxtProdVolgorde.getText();
        String uitgiftenaam = Main.jlblProdNaam.getText();
        PreparedStatement pst = null;
        try {
            String query = "UPDATE `16102150`.uitgiftepunt SET volgordeLijst = ? WHERE uitgifteNaam = ?";
            Connection conn = Database.Database.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, locatie);
            pst.setString(2, uitgiftenaam);
            pst.executeUpdate();
        } catch (Exception e) {
            String query = "SELECT volgordeLijst FROM uitgiftepunt WHERE volgordeLijst >= ? ORDER BY volgordeLijst DESC";
            try {
                Connection conn = Database.Database.getConnection();
                pst = conn.prepareStatement(query);
                pst.setString(1, locatie);
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()) {
                    int key = rs.getInt("volgordeLijst");
                    String query2 = "UPDATE uitgiftepunt SET volgordeLijst = (? + 1) WHERE volgordeLijst = ?";
                    pst = conn.prepareStatement(query2);
                    pst.setInt(1, key);
                    pst.setInt(2, key);
                    pst.executeUpdate();
                }
                
            String query3 = "UPDATE `16102150`.uitgiftepunt SET volgordeLijst = ? WHERE uitgifteNaam = ?";
            pst = conn.prepareStatement(query3);
            pst.setString(1, locatie);
            pst.setString(2, uitgiftenaam);
            pst.executeUpdate();

            } catch (Exception ev) {
                ev.getMessage();
            }
        }
        WeergevenGegevensProd();
    }
}
