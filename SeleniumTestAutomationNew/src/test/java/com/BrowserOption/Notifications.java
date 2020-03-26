package com.BrowserOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class Notifications {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();	
		
		options.addArguments("--disable-notification");
		
//		Instantiate Firefox driver................................
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.google.com/");
	}
}


