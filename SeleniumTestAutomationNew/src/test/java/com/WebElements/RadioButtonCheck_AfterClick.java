package com.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RadioButtonCheck_AfterClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		WebElement  privacyPolicyRadioButton = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]"));
		privacyPolicyRadioButton.click();
		
		boolean actualSelection = privacyPolicyRadioButton.isSelected();
		if (actualSelection == true) 
		{
			System.out.println("default selected - check");
		} 
		else 
		{
			System.out.println("default selected - uncheck");
		}

	}

}


