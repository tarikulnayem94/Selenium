package com.MultipleWindow;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetMultipleWindowsGUID {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://the-internet.herokuapp.com/windows");

		String parentGUID = driver.getWindowHandle();
		System.out.println(" Parent window GUID : " + parentGUID);
		
		driver.findElement(By.cssSelector(".example > a:nth-child(2)")).click();
		Thread.sleep(3000);
		
//		get all session id of the browser .....................................................
		Set<String> allGUID = driver.getWindowHandles();
		System.out.println("All window GUID : " + allGUID);	
		
//		print title all the page ...........................................................
		System.out.println(" Page title before switchig : " +driver.getTitle());
		System.out.println("Total Window :" +allGUID.size());
		
		
	}

}


