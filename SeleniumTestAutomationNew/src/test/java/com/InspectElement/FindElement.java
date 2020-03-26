package com.InspectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FindElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement search_Option = driver.findElement(By.name("search"));
		search_Option.sendKeys("iPhone");
		
		WebElement click_Search_Button = driver.findElement(By.cssSelector("#search > span > button"));
		click_Search_Button.click();
		
//		Check Testing Apply.................................
		
		String expectedTitle = "search - iPhone";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) 
		{
			System.out.println("title pass");
		} 
		else 
		{
			System.out.println("failed");
			System.out.println("Actual Title : "+actualTitle);
		}
		
	}

}



