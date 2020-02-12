package com.InspectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");

		WebElement Search = driver.findElement(By.name("search"));
		Search.sendKeys("iphone");
		WebElement Search_btn = driver.findElement(By.cssSelector("#search > span > button > i"));
		Search_btn.click();

		// Testing Apply..........................

		String ExpectedTitle = "Search - iphone";
		String ActualTitle = driver.getTitle();

		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println(" Success! I got actual result. ");
		} else {
			System.out.println("failed !");
		}
		
		
		
	}
}



