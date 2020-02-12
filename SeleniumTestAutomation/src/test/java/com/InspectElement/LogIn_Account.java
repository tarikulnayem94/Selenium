package com.InspectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LogIn_Account {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement LogIn = driver.findElement(By.name("email"));
		LogIn.sendKeys("tarikul.ewu@gmail.com");
		
		WebElement PassWord = driver.findElement(By.name("password"));
		PassWord.sendKeys("Nayem2888");
		
		WebElement LogIn_btn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
		LogIn_btn.click();
		
		
	}
	
}
