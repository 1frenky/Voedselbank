
import Database.SQLExcelSheetInsert;
import Database.SQLget;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Frenky
 */
public class ImporteerExcelsheet {

    private String xlsx = ".xlsx";

    // Code om de excel uit te lezen voor .xlsx en .xls
    XSSFSheet sheet;
    HSSFSheet sheet1;
    Iterator<Row> rowIterator;

    private String datumUitgifteId = null;
    private String excelDatum = null;
    private int pakketAantal = 0;

    public ImporteerExcelsheet() {
    }

    public void importeerExcelsheet(String filePath) {
        try {
            FileInputStream file = new FileInputStream(new File(filePath));

            if (filePath.toLowerCase().indexOf(xlsx.toLowerCase()) != -1) {
                XSSFWorkbook wbXlsx = new XSSFWorkbook(file);
                sheet = wbXlsx.getSheetAt(0);
                Row row = sheet.getRow(3);
                Cell cell = row.getCell(1);

                // convert String dd-mm-yyyy naar String yyyy-mm-dd 
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String excelDatum1 = cell.getStringCellValue();
                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(excelDatum1);
                this.excelDatum = formatter.format(date1);

                //Iterate through each rows one by one
                rowIterator = sheet.iterator();
            } else {
                HSSFWorkbook wbXls = new HSSFWorkbook(file);
                sheet1 = wbXls.getSheetAt(0);
                Row row = sheet1.getRow(3);
                Cell cell = row.getCell(1);

                // convert String dd-mm-yyyy naar String yyyy-mm-dd 
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String excelDatum1 = cell.getStringCellValue();
                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(excelDatum1);
                this.excelDatum = formatter.format(date1);

                //Iterate through each rows one by one
                rowIterator = sheet1.iterator();
            }

            //Iterate through each rows one by one
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //skip first 5 rows
                if (row.getRowNum() == 0 || row.getRowNum() == 1 || row.getRowNum() == 2 || row.getRowNum() == 3 || row.getRowNum() == 4) {
                    continue;
                }

                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
//                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
//                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_BLANK:
//                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
//                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                }
                // Tabel client
                int kaartnummer = (int) row.getCell(0).getNumericCellValue();
                String naam = row.getCell(1).getStringCellValue();
                String naamPartner = row.getCell(2).getStringCellValue();
                String telefoonnummer = row.getCell(3).getStringCellValue();
                String email = row.getCell(4).getStringCellValue();
                String mobiel = row.getCell(5).getStringCellValue();
                int aantalPersonen = (int) row.getCell(6).getNumericCellValue();
                int aantalPersonenInDeNorm = (int) row.getCell(7).getNumericCellValue();
                double gebruikInMaanden = (double) row.getCell(8).getNumericCellValue();
                String idSoort = row.getCell(9).getStringCellValue();
                //convert excel double naar datum
                double datumUitgifteId1 = row.getCell(10).getNumericCellValue();
                if (datumUitgifteId1 == 0.0) {
                    this.datumUitgifteId = null;
                } else {
                    Date datumUitgifteId2 = DateUtil.getJavaDate((double) datumUitgifteId1);
                    this.datumUitgifteId = new SimpleDateFormat("yyyy/MM/dd").format(datumUitgifteId2);
                }
                ////////////////////////////////////////////////////////////////////////////////////
                String idNummer = row.getCell(11).getStringCellValue();
                String plaatsUitgifteId = row.getCell(12).getStringCellValue();
                String adres = row.getCell(13).getStringCellValue();
                String postcode = row.getCell(14).getStringCellValue();
                String plaats = row.getCell(15).getStringCellValue();
                String status = row.getCell(16).getStringCellValue();

                // Tabel intake
                // kaartnummer gaat hier ook in de query
                String intaker = row.getCell(17).getStringCellValue();
                double intakeDatum1 = row.getCell(18).getNumericCellValue();
                //convert excel double naar datum
                Date intakeDatum2 = DateUtil.getJavaDate((double) intakeDatum1);
                String intakeDatum = new SimpleDateFormat("yyyy/MM/dd").format(intakeDatum2);
                /////////////////////////////////////////////////////////////////////////
                double startDatumUitgifte1 = row.getCell(19).getNumericCellValue();
                //convert excel double naar datum
                Date startDatumUitgifte2 = DateUtil.getJavaDate((double) startDatumUitgifte1);
                String startDatumUitgifte = new SimpleDateFormat("yyyy/MM/dd").format(startDatumUitgifte2);
                //////////////////////////////////////////////////////////////////////////////////
                double datumHerintake1 = row.getCell(20).getNumericCellValue();
                //convert excel double naar datum
                Date datumHerintake2 = DateUtil.getJavaDate((double) datumHerintake1);
                String datumHerintake = new SimpleDateFormat("yyyy/MM/dd").format(datumHerintake2);
                /////////////////////////////////////////////////////////////////////////////////
                // Tabel Stopt
                double datumStopzetting1 = row.getCell(21).getNumericCellValue();
                //convert excel numbers naar datum
                Date datumStopzetting2 = DateUtil.getJavaDate((double) datumStopzetting1);
                String datumStopzetting = new SimpleDateFormat("yyyy/MM/dd").format(datumStopzetting2);
                //////////////////////////////////////////////////////////////////////////////////////
                String redenStopzetting = row.getCell(22).getStringCellValue();

                // Tabel verwijzer
                String verwijzerNaam = row.getCell(23).getStringCellValue();
                String verwijzersDoorContactpersoon = row.getCell(24).getStringCellValue();
                String verwijzersDoorTelefoonnummer = row.getCell(25).getStringCellValue();
                String verwijzersDoorEmail = row.getCell(26).getStringCellValue();
                String verwijzersNaar = row.getCell(27).getStringCellValue();
                String verwijzersNaarContactpersoon = row.getCell(28).getStringCellValue();
                String verwijzersNaarTelefoonnummer = row.getCell(29).getStringCellValue();
                String verwijzersNaarEmail = row.getCell(30).getStringCellValue();

                // Uitgiftepunt gaat in de tabel intake
                String uitgiftepunt = row.getCell(31).getStringCellValue();

                // PakketSoort gaat in de tabel client
                String pakketSoort = row.getCell(32).getStringCellValue();

                // Query's om de excelsheet in de database te krijgen
                SQLExcelSheetInsert excelSQL = new SQLExcelSheetInsert();
                SQLget getSQL = new SQLget();

                // Losse query uit de tabel om bepaalde gegevens te krijgen om te controleren of die al bestaat of niet
                int Verwijzer = getSQL.getVerwijzernr(verwijzerNaam, verwijzersDoorContactpersoon);
                int checkKaartnr = getSQL.getCheckKaartnummer(kaartnummer);
                int checkIntake = getSQL.getCheckIntake(intakeDatum, startDatumUitgifte, datumHerintake, kaartnummer);
                int intakeId = getSQL.getIntakeId(kaartnummer);
                int checkPakket = getSQL.getAantalPakket(this.excelDatum, intakeId);
                String checkStatus = getSQL.getStatus(kaartnummer);

                if (Verwijzer == 0) {
                    excelSQL.insertExcelVerwijzer(verwijzerNaam, verwijzersDoorContactpersoon,
                            verwijzersDoorTelefoonnummer, verwijzersDoorEmail, verwijzersNaar, verwijzersNaarContactpersoon,
                            verwijzersNaarTelefoonnummer, verwijzersNaarEmail);
                }

                if (checkKaartnr == 0) {
                    if (kaartnummer != 0) {
                        excelSQL.insertExcelClient(kaartnummer, naam, naamPartner, telefoonnummer, email, mobiel,
                                aantalPersonen, aantalPersonenInDeNorm, gebruikInMaanden, idSoort, this.datumUitgifteId, idNummer,
                                plaatsUitgifteId, adres, postcode, plaats, status, pakketSoort, Verwijzer);
                    } else {
                        file.close();
                    }
                } else {
                    excelSQL.updateExcelClient(kaartnummer, naam, naamPartner, telefoonnummer, email, mobiel,
                            aantalPersonen, aantalPersonenInDeNorm, gebruikInMaanden, idSoort, this.datumUitgifteId, idNummer,
                            plaatsUitgifteId, adres, postcode, plaats, status, pakketSoort, Verwijzer);
                }

                if (checkIntake == 0) {
                    excelSQL.insertExcelIntake(intaker, intakeDatum, startDatumUitgifte, datumHerintake,
                            kaartnummer, uitgiftepunt);

                    excelSQL.insertExcelStopt(datumStopzetting, redenStopzetting, intakeId);
                }

                // Kan upgedate worden aan een knop voor een query aan status in de table voedselpakket wel of niet opgehaald
                String status1 = null;

                this.pakketAantal = getSQL.getPakketAantal(kaartnummer);

                if (checkPakket == 0) {
                    if (checkStatus.equals("Actief")) {
                        excelSQL.insertVoedselpakket(this.excelDatum, this.pakketAantal, status1, intakeId, uitgiftepunt);
                    }
                }

                System.out.println("");
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
