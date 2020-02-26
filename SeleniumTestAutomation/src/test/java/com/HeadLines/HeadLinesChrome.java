package com.HeadLines;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadLinesChrome 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
//		set Firefox Headless..............
		options.setHeadless(true);
//		Instantiate Firefox driver...........
		ChromeDriver driver = new ChromeDriver(options); 
		
		driver.get("https://bing.com");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
}

