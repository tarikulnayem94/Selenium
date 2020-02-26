package com.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CSSproperty {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
			            	+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement FirstName = driver.findElement(By.name("firstname"));	
		Dimension size = FirstName.getSize();
		System.out.println(size);
		
		String BGcolor = FirstName.getCssValue("background-color");
		System.out.println(BGcolor);

		String LineHeight = FirstName.getCssValue("line-height");
		System.out.println(LineHeight);
		
		String Padding = FirstName.getCssValue("padding");
		System.out.println(Padding);
		
		String BoxShadow = FirstName.getCssValue("box-shadow");
		System.out.println(BoxShadow);
		
		String BorderRadius = FirstName.getCssValue("border-radius");
		System.out.println(BorderRadius);
	}
	
}
