package com.ExcelReadWrite;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAll {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+"\\TestData\\ReadData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");

//		Iteration Through each row one by one .........................	
		
		Iterator<Row> rowIterator = sheet.iterator();  
		while (rowIterator.hasNext()) 
		{
			Row row = rowIterator.next();
			
//			for each row Iterate Through all column.............................
			
			Iterator<Cell> cellIterator = row.cellIterator();  
			while (cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();
				System.out.println(cell.getStringCellValue());
			}
		}
		fis.close();
	}
}
