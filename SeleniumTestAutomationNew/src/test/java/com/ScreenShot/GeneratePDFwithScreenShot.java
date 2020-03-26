package com.ScreenShot;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDFwithScreenShot {
	
	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		take screeShot and store in a byte[] array format ...................
		byte[] screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		Document document = new Document();
		String output = "G:\\screenshot\\screenShotInToPDF.pdf";
		FileOutputStream fileOutputStream = new FileOutputStream(output);
		
//		intaniate the pdf writer...................
		PdfWriter writer = PdfWriter.getInstance(document, fileOutputStream);
		
//		open the pdf for writing....................
		writer.open();
		document.open();
		
//		process content into an image...................
		Image image = Image.getInstance(screenShot);
		
//		set the size of image................
		image.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight()/2);
		
//		add image to PDF...............
		document.add(image);
		document.add(new Paragraph("   "));
		
//		close the file and save to local drive................
		document.close();
		writer.close();
		
	}

}


