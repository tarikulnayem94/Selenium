package com.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AfterClassTest {
	
	WebDriver driver;
	@Test
	public void BasicTest() {
		System.out.println("@Test site executing...........");
		driver.get("https://www.google.com/");
		System.out.println("google is open.");
		System.out.println("@Test executed Successfully.");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@Before Method started work");
		System.out.println("Opening Firefox Browser........");
		driver = new FirefoxDriver();
		System.out.println("Firefox Browser Opened Successfully.");
	}
	@AfterMethod
	public void afterMethod(){
		WebElement googleTextBox = driver.findElement(By.name("q"));
		System.out.println(driver.getTitle());
		googleTextBox.sendKeys(" A, B, C, D, E, F, G, H . . . . . . . . . . . . . . . . ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("@Before class executing........");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		System.out.println("Browser Configaration Completed");
	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@After class will be hold on 20 second");
		Thread.sleep(20000);
		driver.close();
		System.out.println("Browser closed!");
	}

}


