/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.Database.con;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Frenky
 */
public class SQLget extends Database {
    
    public SQLget() throws SQLException, IOException {
        try {
            con = Database.getConnection();
        } catch(Exception e) {
            e.getMessage();
        }
    }
    
    public int getVerwijzernr(String verwijzerNaam, String verwijzersCp){
        int verwijzersnr = 0;
        String sql = "SELECT verwijzernr FROM `16102150`.verwijzer WHERE verwijzerNaam = ? AND verwijzersContactpersoon = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, verwijzerNaam);
            ps.setString(2, verwijzersCp);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                verwijzersnr = rs.getInt("Verwijzernr");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    return verwijzersnr;
    }
    
    public int getIntakeId(int kaartnummer){
        int intakeID = 0;
        String sql = "SELECT intakeID FROM `16102150`.intake JOIN `16102150`.client ON client = kaartnummer WHERE kaartnummer = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, kaartnummer);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                intakeID = rs.getInt("intakeID");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    return intakeID;
    }
}
