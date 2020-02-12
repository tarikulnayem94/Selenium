package com.BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserHeightWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// System.out.println(System.getProperty("user.dir"));
		driver.get("https://www.google.com");

		int hight = driver.manage().window().getSize().height;
		int width = driver.manage().window().getSize().width;

		System.out.println(hight + ";" + width);
		
		int hight1 = driver.manage().window().getSize().height;
		System.out.println(hight1);
		
//		Browser maximize 
		driver.manage().window().maximize();;

	}
}
