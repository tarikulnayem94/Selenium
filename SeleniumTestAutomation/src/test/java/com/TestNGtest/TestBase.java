package com.TestNGtest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	WebDriver driver;
	@Test
	public void f() {
	}
	@BeforeSuite
	public void BrowserConfig() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println(" Browser configaration completed. ");
		driver = new FirefoxDriver();
	}
	@AfterSuite
	public void TestClose() {
		if (driver!=null) 
		{
			driver.close();
		}
	}
}


