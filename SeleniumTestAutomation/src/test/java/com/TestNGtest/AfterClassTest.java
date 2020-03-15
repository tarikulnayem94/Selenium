package com.TestNGtest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class AfterClassTest {
	WebDriver driver;
	@Test
	public void f() {
		System.out.println(" Test site open. ");
		driver.get("https://www.google.com");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Browser lounching........");
		driver = new FirefoxDriver();
		System.out.println("  @BeforeMethod execution completed.............");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println(driver.getTitle());
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("  @BeforeClass EXECUTING.........");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println(" Browser configaration completed. ");
	}
	@AfterClass
	public void afterClass() {
		System.out.println(" @AfterClass executing ........... ");
		driver.quit();
		System.out.println(" @AfterClass class completed. ");
	}
}


