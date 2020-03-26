package com.ScreenShot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base64ToImage {
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
//		Take screenShot............................
		String screenBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
//		Convert the Base64 to file type........................
		File file = OutputType.FILE.convertFromBase64Png(screenBase64);
		
//		Save the converted file as a image.....................
		FileUtils.copyFile(file, new File("G:\\screenshot\\screenBase64File.png"), true);

		
		
	}

}


