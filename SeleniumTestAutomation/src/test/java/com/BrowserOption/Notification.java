package com.BrowserOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class Notification 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		
		options.addArguments(" Disable Notification ");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get(" -- ");
	}

}
