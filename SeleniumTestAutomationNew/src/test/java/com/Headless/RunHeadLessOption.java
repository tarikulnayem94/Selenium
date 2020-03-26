package com.Headless;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class RunHeadLessOption {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		
//		Set Firefox Headless.................
		options.setHeadless(true);		
		
//		Instantiate Firefox driver....................
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}


