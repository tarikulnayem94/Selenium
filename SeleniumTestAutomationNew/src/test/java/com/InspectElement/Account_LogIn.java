package com.InspectElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Account_LogIn {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement emailAddress = driver.findElement(By.name("email"));
		emailAddress.sendKeys("tarikul.nayem@gmail.com");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Nayem2888");

		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]"
				+ "/div/div/div/div[2]/div/form/input"));
		loginButton.click();
		
	}

}


