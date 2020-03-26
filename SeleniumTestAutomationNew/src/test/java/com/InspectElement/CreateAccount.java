package com.InspectElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccount {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Tarikul");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Nayem");
		
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("tarikul.nayem@gmail.com");
		WebElement phone = driver.findElement(By.name("telephone"));
		phone.sendKeys("01701046851");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Nayem2888");
		WebElement confermPassWord = driver.findElement(By.name("confirm"));
		confermPassWord.sendKeys("Nayem2888");
		
//		IS Selected.....................
		
		WebElement subscribeRadioButton = driver.findElement(By.cssSelector("#content > form > "
				+ "fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]"));
		subscribeRadioButton.click();
		
		WebElement privacyPolicyRadioButton = driver.findElement(By.cssSelector(
				"#content > form > div > div > input[type=checkbox]:nth-child(2)"));
		privacyPolicyRadioButton.click();
		
		WebElement registerButton = driver.findElement(By.cssSelector(
				"#content > form > div > div > input.btn.btn-primary"));
		registerButton.click();
		
		
	}

}



