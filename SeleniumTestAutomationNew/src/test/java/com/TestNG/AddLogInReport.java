package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AddLogInReport {
	
	WebDriver driver;
	@BeforeTest
	public void googleOpen() {
		Reporter.log("Browser config...........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
		driver = new FirefoxDriver();
		Reporter.log("Browser open");
		driver.get("https://www.google.com/");
		Reporter.log("Test site open");
	}

	@Test(description = "This is the test method for title")
	public void googleTitle() {
		Reporter.log(" Getting title......... ");
		System.out.println(driver.getTitle());
	}

	@Test(description = "This is the test method for open google")
	public void tearDown() {
		driver.close();
		Reporter.log("Browser CLOSED !.");
	}
	
}

