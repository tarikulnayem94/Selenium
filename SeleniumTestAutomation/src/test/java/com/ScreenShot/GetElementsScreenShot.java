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
public class GetElementsScreenShot {
	    public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		locate image element to capture a screenshot .............
		WebElement element = driver.findElement(By.cssSelector("#content > ul:nth-child(4) > li:nth-child(1) > a:nth-child(1)"));

//		capture entire page screenshot as file................
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		using selenium point class to gate (X, Y) coordinates of point ............
//		gate location of (X,Y coordinates) of the element ................
		Point point = element.getLocation();
		int Xcoordinates = point.getX();
		int Ycoordinates = point.getY();
		
//		using selenium getSize() method to get height and width of the element ........................ 		
		int imageWeight = element.getSize().getWidth();
		int imageHidth = element.getSize().getHeight();
		
//		reading full image screenshot  .................
		BufferedImage img = ImageIO.read(screen);
		
//		cut image using height width (X, Y) coordinates
		BufferedImage destination = img.getSubimage(Xcoordinates, Ycoordinates, imageWeight, imageHidth);
		ImageIO.write(destination, "png", screen);
		
//		save image screenshot to drive ................
		FileUtils.copyFile(screen, new File("G:\\screenshot\\ElementscreenShot.png"));
	}

}


