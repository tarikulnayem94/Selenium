package com.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
public class ReadFromProperties {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\java\\PropertiesFile\\OR.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		properties.getProperty("openGoogle");
		
		System.out.println("Browser Config...........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(properties.getProperty("openGoogle"));
		
	
		
	}

}


