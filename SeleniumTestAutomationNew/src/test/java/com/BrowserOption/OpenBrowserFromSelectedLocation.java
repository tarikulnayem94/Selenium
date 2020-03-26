package com.BrowserOption;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OpenBrowserFromSelectedLocation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}

}


