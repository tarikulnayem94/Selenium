package com.BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TitleVerification {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Drivers\\geckodriver.exe" );

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/NewDynamicWebProject/Upload.html");
		
		String expectedTitle = "File Upload to Database Demo";
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String showURL = driver.getCurrentUrl();
		System.out.println(showURL);
		
		if (expectedTitle.equals(actualTitle)) 
		{
			System.out.println(" title pass ");
		}
		else 
		{
			System.out.println(" failed ! ");
		}
		
	}

}



