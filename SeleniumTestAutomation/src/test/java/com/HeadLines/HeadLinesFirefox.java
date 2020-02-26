package com.HeadLines;
import java.sql.Driver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class HeadLinesFirefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		
//		set Firefox Headless..............
		options.setHeadless(true);
		
//		Instantiate Firefox driver...........
		FirefoxDriver driver = new FirefoxDriver(options); 
		
		driver.get("https://bing.com");
		
		System.out.println(driver.getTitle());
		driver.quit();

	}

}





