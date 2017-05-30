
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
    
    // Dit klopt nog niet!!!!!!!!!
    private Sheet sheet;
    
    public ImporteerExcelsheet(){
    }
    
    public void importeerExcelsheet(String fileNaam, String filePath){
        try
        {   
            FileInputStream file = new FileInputStream(new File(filePath));
 
            if ( filePath.toLowerCase().indexOf(xlsx.toLowerCase()) != -1 ) {
                XSSFWorkbook workbook = new XSSFWorkbook(filePath);
                
                XSSFSheet sheet = workbook.getSheetAt(0);
                
            } else {
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                
                HSSFSheet sheet = workbook.getSheetAt(0);
            }
            
            //Create Workbook instance holding reference to .xlsx file
//            XSSFWorkbook workbook = new XSSFWorkbook(filePath);
//            HSSFWorkbook workbook = new HSSFWorkbook(file);
            
            //Get first/desired sheet from the workbook
//            XSSFSheet sheet = workbook.getSheetAt(0);
//            HSSFSheet sheet = workbook.getSheetAt(0);
            
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
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
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "t");
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
