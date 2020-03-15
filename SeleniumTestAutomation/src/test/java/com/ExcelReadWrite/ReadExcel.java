package com.ExcelReadWrite;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\ReadData.xlsx");
	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("Sheet1");
		Row row = sht.getRow(0);
 		Cell cell = row.getCell(0);
		 
 		System.out.println(cell.getStringCellValue());
	}
}

