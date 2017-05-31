
import java.io.File;
import java.io.FileInputStream;
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
    
    private String xls = ".xls";
    private String xlsx = ".xlsx";
    
    // Code om de excel uit te lezen voor .xlsx en .xls
    XSSFSheet sheet;
    HSSFSheet sheet1;
    Iterator<Row> rowIterator;
    
    public ImporteerExcelsheet(){
    }
    
    public void importeerExcelsheet(String fileNaam, String filePath){
        try
        {   
            FileInputStream file = new FileInputStream(new File(filePath));
            
            if ( filePath.toLowerCase().indexOf(xlsx.toLowerCase()) != -1 ) {
                XSSFWorkbook wbXlsx = new XSSFWorkbook(filePath);
                sheet = wbXlsx.getSheetAt(0);
                //Iterate through each rows one by one
                rowIterator = sheet.iterator();
            } else {
                HSSFWorkbook wbXls = new HSSFWorkbook(file);
                sheet1 = wbXls.getSheetAt(0);
                //Iterate through each rows one by one
                rowIterator = sheet1.iterator();
            }
            
            //Create Workbook instance holding reference to .xlsx file
//            voor .xlsx bestanden
//            XSSFWorkbook workbook = new XSSFWorkbook(filePath);
//            voor .xls bestanden
//            HSSFWorkbook workbook = new HSSFWorkbook(file);
            
            //Get first/desired sheet from the workbook
//            voor .xlsx bestanden
//            XSSFSheet sheet = workbook.getSheetAt(0);
//            voor .xls bestanden
//            HSSFSheet sheet = workbook.getSheetAt(0);
            
            //Iterate through each rows one by one
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                }
                System.out.println("");
            }
            file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
