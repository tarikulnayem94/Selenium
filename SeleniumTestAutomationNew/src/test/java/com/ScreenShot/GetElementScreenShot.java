package com.ScreenShot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetElementScreenShot {
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
//		locate image element to capture a screenShot.................
		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a"));

//		capture entire page screenShot as a file.....................
		File screenFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		using selenium pointClass to get x, y coordinates of image............
//		get location of ( x, y coordinates ) of the element...................
		Point point = element.getLocation();
		int xCoordinate = point.getX();
		int yCoordinate = point.getY();
		
//		Using selenium getSize Method to get height width of the element...........
//		Retrieves width of the elements
//		Retrieves height of the elements.......................
		int imageWidth = element.getSize().getWidth();
		int imageHeight = element.getSize().getHeight();
		
//		Reading full image screenShot ........................
		BufferedImage image = ImageIO.read(screenFile);
		
//		Cut image using height, width ( X ,Y coordinates )...........
		BufferedImage destination = image.getSubimage(xCoordinate, yCoordinate, imageWidth, imageHeight);                         
		ImageIO.write(destination, "png", screenFile);
		
//		save image screenShot to drive
		FileUtils.copyFile(screenFile, new File("G:\\screenshot\\ElementScreenShot.png"), true);
		
		
		
	}

}



