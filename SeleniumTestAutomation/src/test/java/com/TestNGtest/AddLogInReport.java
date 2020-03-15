package com.TestNGtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddLogInReport {
	WebDriver driver;

	@BeforeTest
	public void OpenGoogle() {
//		Reporter.log(" Browser config........ ");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println(" Browser configaration completed. ");
		driver = new FirefoxDriver();
//		Reporter.log(" Browser open.......... ");
		driver.get("https://www.google.com");
//		Reporter.log(" Test site open.......... ");
	}
	@Test(description = " This is Test method for Tittle ")
	public void GetGoogleTitle() 
	{
		Reporter.log(" Getting title .......... ");
		System.out.println(driver.getTitle());
	}
	public void GetGoogleurl() 
	{
		Reporter.log(" Getting URL.......... ");
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void TearDown() {
		driver.close();
		Reporter.log(" Browser closed! ");
	}
}


