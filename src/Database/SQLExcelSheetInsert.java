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
    }

    public void insertExcelVerwijzer(String verwijzerNaam, String verwijzerContactpersoon, String verwijzersTelefoonnr,
            String verwijzersDoorEmail, String verwijzersNaar, String verwijzersDoorContactpersoon, String verwijzersNaarTelefoonnummer,
            String verwijzersNaarEmail) throws SQLException, IOException {
        String sql = "INSERT INTO `16102150`.verwijzer(verwijzerNaam, verwijzersContactpersoon, verwijzersTelefoonnr, "
                + "verwijzerEmail, verwijzersNaar, verwijzersNaarContactPersoon, verwijzersNaarTelefoon, verwijzersNaarEmail) "
                + "VALUES(?,?,?,?,?,?,?,?)";
        try {
            con = Database.getConnection();
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
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void insertExcelClient(int kaartnummer, String naam, String naamPartner, String telefoonnummer,
            String email, String mobiel, int aantalPersonen, int aantalPersonenInDeNorm, double gebruikInMaanden, String idSoort,
            String datumUitgifteId, String idNummer, String plaatsUitgifte, String adres, String postcode,
            String plaats, String status, String pakketSoort, int verwijzernr) throws SQLException, IOException {
        String sql = "Insert into `16102150`.client(kaartnummer, naam, naamPartner, telefoonnummer, email, mobiel, aantalPersonen, aantalPersonenInDeNorm,"
                + "gebruikInMaanden, idSoort, datumUitgifteId, idNummer, plaatsUitgifteId, adres, postcode, plaats, status, pakketSoort, Verwijzer) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            con = Database.getConnection();
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
            ps.setString(11, datumUitgifteId);
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
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void insertExcelIntake(String intaker, String intakeDatum, String startdatumUitgifte, String datumHerintake,
            int kaartnummer, String uitgiftepunt) throws SQLException, IOException {
        String sql = "INSERT INTO `16102150`.intake(intaker, intakeDatum, startDatum, datumHerintake, client, uitgiftepunt) "
                + "VALUES(?, ?, ?, ? , ?, ?)";
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, intaker);
            ps.setString(2, intakeDatum);
            ps.setString(3, startdatumUitgifte);
            ps.setString(4, datumHerintake);
            ps.setInt(5, kaartnummer);
            ps.setString(6, uitgiftepunt);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void insertExcelStopt(String datumStopzetting, String redenStopzetting, int Intake) throws SQLException, IOException {
        String sql = "INSERT INTO `16102150`.stopt(datumStopzetting, redenStopzetting, Intake) VALUES(?, ?, ?)";
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, datumStopzetting);
            ps.setString(2, redenStopzetting);
            ps.setInt(3, Intake);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void insertVoedselpakket(String datum, int aantalPakketten, String status, int intakeId, String uitgiftepunt) {
        String sql = "INSERT INTO voedselpakket(datum, aantalPakketten, status, Intake, uitgiftepunt) VALUES (?, ?, ?, ?, ?)";
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, datum);
            ps.setInt(2, aantalPakketten);
            ps.setString(3, status);
            ps.setInt(4, intakeId);
            ps.setString(5, uitgiftepunt);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
