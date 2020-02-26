package com.InspectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Create_an_Account {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement FirstName = driver.findElement(By.name("firstname"));
		FirstName.sendKeys("tarikul");	
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("nayem");
		 
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("tarikul.nayem@gmail.com");
		WebElement Telephone = driver.findElement(By.name("telephone"));
		Telephone.sendKeys("01712575851");
		
		WebElement PassWord = driver.findElement(By.name("password"));
		PassWord.sendKeys("Nayem2888");
		WebElement ConfermPassWord = driver.findElement(By.name("confirm"));
		ConfermPassWord.sendKeys("Nayem2888");
		
//		IS Selected.....................
		
		String yesRadioButtonXPath = "/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[1]/input";
				WebElement yesRadioButton = driver.findElement(By.xpath(yesRadioButtonXPath));
				yesRadioButton.click();
				
		String noRadioButtonXPath = "/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input";
				WebElement noRadioButton = driver.findElement(By.xpath(noRadioButtonXPath));
				yesRadioButton.click();
	
//		WebElement RadioButton = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]"));
//		boolean ActualSelection = RadioButton.isSelected();
//		if (ActualSelection == true) {
//			System.out.println("Default Selection. no!");
//		}
//		else {
//			System.out.println("yes!");
//		}
				
		WebElement AgreeRadioButton = driver.findElement(By.name("agree"));
		AgreeRadioButton.click();
				
		WebElement Register_btn = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
		Register_btn.click();
		

	}

}
