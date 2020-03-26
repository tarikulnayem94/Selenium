package com.MouseAndKeyboardUse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement element = driver.findElement(By.linkText("Your Store"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(element);
		action.perform();

	}

}


