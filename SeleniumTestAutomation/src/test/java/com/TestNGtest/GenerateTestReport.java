package com.TestNGtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class GenerateTestReport {
	
	WebDriver driver;
	@BeforeTest
	public void OpenGoogle() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println(" Browser configaration completed. ");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	@Test ( description = " This is Test method for Tittle ")
	public void GetGoogleTitle() {
		System.out.println(driver.getTitle());
	}
	@Test
	public void TearDown(){
		driver.close();
	}
}


