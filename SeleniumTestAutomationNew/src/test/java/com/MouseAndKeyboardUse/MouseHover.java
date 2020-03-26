package com.MouseAndKeyboardUse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///G:/8th%20Class/11.%20Mouse%20and%20Keyboard/MouseHover.html");
		WebElement element = driver.findElement(By.xpath("/html/body/p"));

		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();

//		new page open....................................................
		driver.get("https://demo.opencart.com/");
		WebElement newElement = driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[3]/a"));

		Actions newActions = new Actions(driver);
		newActions.moveToElement(newElement).build().perform();

	}

}




