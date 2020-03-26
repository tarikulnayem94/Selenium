package com.BasicSelenium;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SetWindowsSize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/NewDynamicWebProject/Upload.html");
		
		driver.manage().window().setSize(new Dimension(300, 300));
		
		driver.close();
	}

}
