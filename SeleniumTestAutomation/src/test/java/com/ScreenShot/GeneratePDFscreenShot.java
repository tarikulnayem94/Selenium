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
public class GeneratePDFscreenShot {

	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

//		take a screenshot & store it in byte[] in a format .........
		byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		Document document = new Document();
		String output = "G:\\screenshot\\PDFcreenShot.pdf";
		FileOutputStream fos = new FileOutputStream(output);
		
//		Instantiate the PDF format ...........
		PdfWriter writer = PdfWriter.getInstance(document, fos);
		
//		open the PDF for writing ...........
		document.open();
		writer.open();
		
//		process content into an image .............
		Image img = Image.getInstance(input);
		
//		set the size of image .................
		img.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);
		
//		add image to PDF ..............
		document.add(img);
		document.add(new Paragraph(" "));
		
//		close the file and save into local drive .............
		document.close();
		writer.close();
		
	}
}

