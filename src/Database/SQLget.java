/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.Database.con;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Frenky
 */
public class SQLget extends Database {

    public SQLget() throws SQLException, IOException {
    }

    public int getVerwijzernr(String verwijzerNaam, String verwijzersCp) throws IOException {
        int verwijzersnr = 0;
        String sql = "SELECT verwijzernr FROM `16102150`.verwijzer WHERE verwijzerNaam = ? AND verwijzersContactpersoon = ?";
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, verwijzerNaam);
            ps.setString(2, verwijzersCp);
            rs = ps.executeQuery();

            while (rs.next()) {
                verwijzersnr = rs.getInt("Verwijzernr");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return verwijzersnr;
    }

    public int getPakketAantal(int kaartnummer) {
        String pakketSoort = null;
        int pakketAantal = 0;
        String sql = "SELECT pakketSoort from client WHERE kaartnummer = ? AND status = 'Actief'";
        //    String sql = "SELECT client.pakketsoort from intake JOIN client ON intake.client = client.kaartnummer JOIN uitgiftepunt ON intake.Uitgiftepunt = uitgifteNaam WHERE kaartnummer = 69664";
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, kaartnummer);
            rs = ps.executeQuery();

            while (rs.next()) {
                pakketSoort = rs.getString("pakketSoort");
            }

            if (pakketSoort.equals("Enkelvoudig pakket")) {
                pakketAantal = 1;
            } else if (pakketSoort.equals("Dubbel pakket")) {
                pakketAantal = 2;
            } else if (pakketSoort.equals("3-voudig pakket")) {
                pakketAantal = 3;
            } else {
                pakketAantal = 0;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return pakketAantal;
    }
    
    public String getStatus(int kaartnummer) throws SQLException, IOException{
        String status = null;
        String sql = "SELECT status FROM client WHERE kaartnummer = ?";
         try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, kaartnummer);
            rs = ps.executeQuery();

            while (rs.next()) {
                status = rs.getString("status");
            }
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return status;
    }
    
    public int getCheckKaartnummer(int kaartnummer) throws SQLException, IOException{
        String sql = "SELECT count(kaartnummer) FROM client WHERE kaartnummer = ?";
         try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, kaartnummer);
            rs = ps.executeQuery();

            while (rs.next()) {
                kaartnummer = rs.getInt(1);
            }
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return kaartnummer;
    } 

    public int getCheckIntake(String intakeDatum, String startDatumUitgifte, String datumHerintake, int kaartnummer) {
        int check = 0;
        String sql = "SELECT count(*) FROM intake WHERE intakeDatum = ? AND startDatum = ? AND datumHerintake = ? AND client = ?";
         try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, intakeDatum);
            ps.setString(2, startDatumUitgifte);
            ps.setString(3, datumHerintake);
            ps.setInt(4, kaartnummer);
            rs = ps.executeQuery();

            while (rs.next()) {
                check = rs.getInt(1);
            }
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return check;
    }

    public int getPakket(String datum, int intakeId) {
        int check = 0;
        String sql = "SELECT count(*) FROM voedselpakket WHERE datum = ? AND Intake = ?";
         try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, datum);
            ps.setInt(2, intakeId);
            rs = ps.executeQuery();

            while (rs.next()) {
                check = rs.getInt(1);
            }
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return check;
    }

    public int getUitgiftepunt(String uitgiftepunt) {
        int check = 0;
        String sql = "SELECT count(*) FROM uitgiftepunt WHERE uitgifteNaam = ?";
         try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, uitgiftepunt);
            rs = ps.executeQuery();

            while (rs.next()) {
                check = rs.getInt(1);
            }
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return check;
    }
    
    public int getIntakeId(int kaartnummer) throws IOException {
        int intakeID = 0;
        String sql = "SELECT intakeID FROM `16102150`.intake JOIN `16102150`.client ON client = kaartnummer WHERE kaartnummer = ?";
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, kaartnummer);
            rs = ps.executeQuery();

            while (rs.next()) {
                intakeID = rs.getInt("intakeID");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return intakeID;
    }
    
     public ResultSet getProductielijst() throws IOException {
        String sql = "SELECT Uitgiftepunt, sum(aantalPakketten) Pakketten FROM voedselpakket, uitgiftepunt WHERE Uitgiftepunt = uitgifteNaam AND datum IN (SELECT MAX(datum) from voedselpakket) GROUP BY uitgifteNaam order by volgordeLijst ASC;";
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return rs;
    }
     
     public int getCheckVolgordeLijst() throws IOException {
        String sql = "SELECT MAX(volgordeLijst) as volgordeLijst FROM uitgiftepunt";
        int volgorde = 0;
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
             while (rs.next()) {
                volgorde = rs.getInt("volgordeLijst");
            }
           
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return volgorde;
    }
     
}
