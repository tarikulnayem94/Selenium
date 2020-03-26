package com.BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ShowURLandTitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Drivers\\geckodriver.exe" );

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/NewDynamicWebProject/Upload.html");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String showURL = driver.getCurrentUrl();
		System.out.println(showURL);
		
	}

}
