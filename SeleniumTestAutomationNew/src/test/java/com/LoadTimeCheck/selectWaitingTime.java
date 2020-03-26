package com.LoadTimeCheck;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectWaitingTime {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		long startTime = System.currentTimeMillis();
		driver.get("https://www.google.com/");
		long finishedTime = System.currentTimeMillis();

		System.out.println("web Page title : " + driver.getTitle());
		
		long totalLoadTime = (finishedTime - startTime);
		System.out.println("Total Load Time : " + totalLoadTime/1000 + " SECONDS");
		
	}

}


