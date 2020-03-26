package com.LoadTimeCheck;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebPageLoadTimeCheck {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		long startTime = System.currentTimeMillis();
		
		driver.get("https://www.facebook.com/");
		
		long finishedTime = System.currentTimeMillis();
		
		long totalLoadTime = (finishedTime - startTime);
		System.out.println("Total Load Time : " + totalLoadTime);
		
	}

}



