package com.Keyboard_Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/WebProject/Index.html");
		
		WebElement element = driver.findElement(By.cssSelector("body > p:nth-child(2)"));
	    Actions actions = new Actions(driver);
	    
	    actions.moveToElement(element).build().perform(); 
	    
	}
}
