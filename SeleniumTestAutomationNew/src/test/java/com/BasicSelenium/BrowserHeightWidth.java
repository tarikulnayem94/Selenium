package com.BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserHeightWidth {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Drivers\\geckodriver.exe");

//		Initialize browser.................................
		WebDriver driver = new FirefoxDriver();	
//		Open browser with web page.............................
		driver.get("https://www.google.com");
		
		int height = driver.manage().window().getSize().height;
		int width = driver.manage().window().getSize().width;
		
		System.out.println(height + " : " + width);
		
		int Height = driver.manage().window().getSize().getHeight();
		System.out.println(Height);
		
//		Browser Maximize...................................
		driver.manage().window().maximize();
		
		
	}
	
}


