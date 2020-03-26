package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
public class TestBase {
	
	WebDriver driver;

	@BeforeSuite
	public void BrowserConfigaration() {
		System.out.println("@Before Suite executing........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
	}

	@AfterSuite
	public void TestClosed() {
			System.out.println("@After Suite");
//			Thread.sleep(10000);
//			driver.close();
	}

}



