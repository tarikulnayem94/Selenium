package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BeforeMethodTest {
	
	WebDriver driver;
	@Test
	public void simpleTest() 
	{
		driver.get("https://www.google.com/");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}

}



