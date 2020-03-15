package com.TestNGtest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BeforeMethodTest 
{
	WebDriver driver;
	
	@Test
	public void BasicTest() 
	{
		driver.get("https://www.google.com");
	}

	@BeforeMethod
	public void beforeMethod() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}

}
