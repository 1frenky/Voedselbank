/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.IOException;
import java.sql.*;

/**
 *
 * @author Frenky
 */
public class SQLExcelSheetInsert extends Database {
    // Client tabel
    // kaartnummer, naam, naamPartner, telefoonnummer, email, mobiel, aantalPersonen, gebruikInMaanden, idSoort, idNummer, plaatsUitgifteID, adres, postcode, plaats, status, Verwijzer
    // Voedselpakket tabel
    // pakketID, datum, aantalPakketten, status, Intake, Uitgiftepunt
    // verwijzer tabel
    // verwijzernr, verwijzernaam, verwijzersContactpersoon, verwijzersTelefoonnr, verwijzerEmail, verwijzersNaar, verwijzersNaarContactPersoon, verwijzersNaarTelefoon, verwijzersNaarEmail
    // Intake tabel
    // intakeID, intaker, intakeDatum, startDatum, datumHerintake, client, uitgiftepunt
    // Uitgiftepunt tabel
    // uitgiftenaam, adres, plaats, aantalMensen, maxCapiciteit
    // stopt tabel
    // ID, datumStopzetting, reden_topZetting, Intake

    public SQLExcelSheetInsert() throws SQLException, IOException {
        try {
            con = Database.getConnection();
        } catch(Exception e) {
            e.getMessage();
        }
    }
    
    public void insertExcelVerwijzer(String verwijzerNaam, String verwijzerContactpersoon, String verwijzersTelefoonnr,
            String verwijzersDoorEmail, String verwijzersNaar, String verwijzersDoorContactpersoon, String verwijzersNaarTelefoonnummer,
            String verwijzersNaarEmail) throws SQLException {
            String sql = "INSERT INTO intake(verwijzernaam, verwijzersContactpersoon, verwijzersTelefoonnr, "
                + "verwijzerEmail, verwijzersNaar, verwijzersNaarContactPersoon, verwijzersNaarTelefoon, verwijzersNaarEmail) "
                + "VALUES(?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, verwijzerNaam);
            ps.setString(2, verwijzerContactpersoon);
            ps.setString(3, verwijzersTelefoonnr);
            ps.setString(4, verwijzersDoorEmail);
            ps.setString(5, verwijzersNaar);
            ps.setString(6, verwijzersDoorContactpersoon);
            ps.setString(7, verwijzersNaarTelefoonnummer);
            ps.setString(8, verwijzersNaarEmail);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insertExcelClient(int kaartnummer, String naam, String naamPartner, String telefoonnummer,
            String email, String mobiel, int aantalPersonen, int aantalPersonenInDeNorm, double gebruikInMaanden, String idSoort, java.util.Date datumUitgifteId,
            String idNummer, String plaatsUitgifte, String adres, String postcode,
            String plaats, String status, String pakketSoort, int verwijzernr) throws SQLException {
            String sql = "Insert into client(kaartnummer, naam, naamPartner, telefoonnummer, email, mobiel, aantalPersonen, "
                + "gebruikInMaanden, idSoort, idNummer, plaats_Uitgifte, adres, postcode, plaats, status, pakketSoort, Verwijzer) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, kaartnummer);
            ps.setString(2, naam);
            ps.setString(3, naamPartner);
            ps.setString(4, telefoonnummer);
            ps.setString(5, email);
            ps.setString(6, mobiel);
            ps.setInt(7, aantalPersonen);
            ps.setInt(8, aantalPersonenInDeNorm);
            ps.setDouble(9, gebruikInMaanden);
            ps.setString(10, idSoort);
            ps.setDate(11, (Date) datumUitgifteId);
            ps.setString(12, idNummer);
            ps.setString(13, plaatsUitgifte);
            ps.setString(14, adres);
            ps.setString(15, postcode);
            ps.setString(16, plaats);
            ps.setString(17, status);
            ps.setString(18, pakketSoort);
            ps.setInt(19, verwijzernr);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insertExcelIntake(String intaker, java.util.Date intakeDatum, java.util.Date startdatumUitgifte, java.util.Date datumHerintake,
                                  int kaartnummer, String uitgiftepunt) throws SQLException {
            String sql = "INSERT INTO intake(intaker, intakeDatum, startDatum, datumHerintake, client, uitgiftepunt) "
                + "VALUES(?, ?, ?, ? , ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, intaker);
            ps.setDate(2, (Date) intakeDatum);
            ps.setDate(3, (Date) startdatumUitgifte);
            ps.setDate(4, (Date) datumHerintake);
            ps.setInt(5, kaartnummer);
            ps.setString(6, uitgiftepunt);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insertExcelStopt(java.sql.Date datumStopzetting, String redenStopzetting, int Intake) throws SQLException {
        String sql = "INSERT INTO Stopt(ID, datumStopzetting, redenStopzetting, Intake) VALUES(?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, datumStopzetting);
            ps.setString(2, redenStopzetting);
            ps.setInt(3, Intake);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
