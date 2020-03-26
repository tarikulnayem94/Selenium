package com.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CSSproperties {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

//		Select the firstName text Box........................................
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		Dimension size = firstName.getSize();
		System.out.println(size);
		
		
		String backgroundColor = firstName.getCssValue("background-color");
		System.out.println(backgroundColor);
		
		String lineHeight = firstName.getCssValue("line-height");
		System.out.println(lineHeight);
		
		String padding = firstName.getCssValue("padding");
		System.out.println(padding);
		
		String boxShdow = firstName.getCssValue("box-shadow");
		System.out.println(boxShdow);
		
		String borderRadious = firstName.getCssValue("border-radius");
		System.out.println(borderRadious);
		
	} 

}

