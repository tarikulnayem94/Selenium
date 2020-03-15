package com.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromProperties 

{
	public static void main(String[] args) { 
		
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream(System.getProperty("user.dir")+"\\SeleniumTestAutomation\\PropertiesFile\\OR.Properties");
			prop.load(input);
			System.out.println(prop.getProperty("TestSite"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
		
	}
}

