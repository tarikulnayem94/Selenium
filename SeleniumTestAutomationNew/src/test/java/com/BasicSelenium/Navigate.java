package com.BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Navigate {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/NewDynamicWebProject/Upload.html");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		driver.navigate().forward();
	}

}
