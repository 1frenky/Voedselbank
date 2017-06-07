
import Database.SQLExcelSheetInsert;
import Database.SQLget;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.*;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;
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

    public ImporteerExcelsheet(){
    }

    public void importeerExcelsheet(String filePath) {
        try {
            FileInputStream file = new FileInputStream(new File(filePath));

            if (filePath.toLowerCase().indexOf(xlsx.toLowerCase()) != -1) {
                XSSFWorkbook wbXlsx = new XSSFWorkbook(file);
                sheet = wbXlsx.getSheetAt(0);
                //Iterate through each rows one by one

                rowIterator = sheet.iterator();
            } else {
                HSSFWorkbook wbXls = new HSSFWorkbook(file);
                sheet1 = wbXls.getSheetAt(0);
                //Iterate through each rows one by one
                rowIterator = sheet1.iterator();
            }

            //Iterate through each rows one by one
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //skip first 5 rows
                if(row.getRowNum()== 0 || row.getRowNum()==1 || row.getRowNum()==2 || row.getRowNum()==3 || row.getRowNum()==4){
                    continue;
                }                
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.print(cell.getStringCellValue() + "\t");
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
                Date datumUitgifteId = row.getCell(10).getDateCellValue();
                String idNummer = row.getCell(11).getStringCellValue();
                String plaatsUitgifteId = row.getCell(12).getStringCellValue();
                String adres = row.getCell(13).getStringCellValue();
                String postcode = row.getCell(14).getStringCellValue();
                String plaats = row.getCell(15).getStringCellValue();
                String status = row.getCell(16).getStringCellValue();
                
                // Tabel intake
                // kaartnummer gaat hier ook in de query
                String intaker = row.getCell(17).getStringCellValue();
                Date intakeDatum = row.getCell(18).getDateCellValue();
                Date startdatumUitgifte = row.getCell(19).getDateCellValue();
                Date datumHerintake = row.getCell(20).getDateCellValue();
                
                // Tabel Stopt
                Date datumStopzetting = row.getCell(21).getDateCellValue();
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
                
                SQLExcelSheetInsert ExcelSQL = new SQLExcelSheetInsert();
                SQLget getSQL = new SQLget();
                
                ExcelSQL.insertExcelVerwijzer(verwijzerNaam, verwijzersDoorContactpersoon, 
                        verwijzersDoorTelefoonnummer, verwijzersDoorEmail, verwijzersNaar, verwijzersNaarContactpersoon, 
                        verwijzersNaarTelefoonnummer, verwijzersNaarEmail);
                
                int Verwijzer = getSQL.getVerwijzernr(verwijzerNaam, verwijzersDoorContactpersoon);
                
                ExcelSQL.insertExcelClient(kaartnummer, naam, naamPartner, telefoonnummer, email, mobiel, 
                        aantalPersonen, aantalPersonenInDeNorm, gebruikInMaanden, idSoort, datumUitgifteId, idNummer,
                        plaatsUitgifteId, adres, postcode, plaats, status, pakketSoort, Verwijzer);
                
                ExcelSQL.insertExcelIntake(intaker, intakeDatum, startdatumUitgifte, datumHerintake, 
                        kaartnummer, uitgiftepunt);
                
                int intakeId = getSQL.getIntakeId(kaartnummer);
                
                ExcelSQL.insertExcelStopt((java.sql.Date) datumStopzetting, redenStopzetting, intakeId);
                
                System.out.println("");
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
