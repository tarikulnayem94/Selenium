package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextVerify {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
//		driver.get("https://demo.opencart.com/");
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		WebElement text = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a"));
		System.out.println(text.getText());

		WebElement findValue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
		System.out.println(findValue.getAttribute("value"));

		System.out.println(driver.findElement(By.name("firstname")).getAttribute("id"));

		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		
		
	}

}


