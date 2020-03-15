package com.TestNGtest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
public class AfterMethodTest 
{
	WebDriver driver;
	@Test
	public void f() 
	{
		System.out.println(" @Test executing .......... ");
		driver.get("https://www.google.com");
		System.out.println(" @Test executed successfully ! ");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Opening firefox browser ..... ");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
			            	+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println(" firefox browser is opened ");
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("closing firefox browser ..... ");
		driver.close();
		System.out.println(" firefox browser closed successfully. ");
	}

}
