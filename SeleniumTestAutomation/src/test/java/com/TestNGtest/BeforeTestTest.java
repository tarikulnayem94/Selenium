package com.TestNGtest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BeforeTestTest {
	WebDriver driver;
	@Test
	public void f() {
		System.out.println(" Test site open. ");
		driver.get("https://www.google.com");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Browser lounching........");
		// driver = new FirefoxDriver();
		System.out.println("  @BeforeMethod execution completed.............");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println(driver.getTitle());
		System.out.println("  @AfterMethod execution completed.............");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("  @BeforeClass EXECUTING.........");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println(" Browser configaration completed. ");
		driver = new FirefoxDriver();
	}
}
