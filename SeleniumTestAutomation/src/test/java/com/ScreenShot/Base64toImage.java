package com.ScreenShot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base64toImage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		take screenshot ...............
		String srcBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
//		convert Base64 to file type.................... 
		File file = OutputType.FILE.convertFromBase64Png(srcBase64);
		
//		SAVE THE CONVERTED file to image ................. 
		FileUtils.copyFile(file, new File("G:\\screenshot\\BASE64screenShot.png"));
	}

}
