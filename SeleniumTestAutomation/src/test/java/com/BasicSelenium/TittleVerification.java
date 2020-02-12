package com.BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TittleVerification {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// System.out.println(System.getProperty("user.dir"));
		driver.get("http://localhost:8080/WebProject/Index.html");
		
		String ExpectedTitle = "My Testing Web Site";
		String ActualTitle = driver.getTitle();

		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("title pass");
		}
		else {
			System.out.println("failed !");
		}
		
		String ExpectedURL = "http://localhost:8080/WebProject/Index.html";
		String ActualURL = driver.getCurrentUrl();
		
		if (ExpectedURL.equals(ActualURL)) {
			System.out.println("url match");
		}
		else {
			System.out.println("failed !");
		}
	}
}
