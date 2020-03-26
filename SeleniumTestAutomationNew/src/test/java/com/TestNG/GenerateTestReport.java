package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GenerateTestReport {

	WebDriver driver;

	@BeforeTest
	public void googleOpen() {
		System.out.println("@Before test executing........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

	@Test(description = "This is the test method for title")
	public void googleTitle() {
		System.out.println(driver.getTitle());
	}

	@Test(description = "This is the test method for open google")
	public void tearDown() {
		driver.close();
	}
	
}


