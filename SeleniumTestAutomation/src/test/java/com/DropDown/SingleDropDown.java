package com.DropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class SingleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
//		find DropDown .............
		WebElement dropDownElementDay = driver.findElement(By.name("birthday_day"));
		WebElement dropDownElementMonth = driver.findElement(By.name("birthday_month"));
		WebElement dropDownElementYear = driver.findElement(By.name("birthday_year"));
		
//		create object for Select Class ............
		Select dropDownDay = new Select(dropDownElementDay);
		Select dropDownMonth = new Select(dropDownElementMonth);
		Select dropDownYear = new Select(dropDownElementYear);
		
//		select Day from DropDown ..........
		dropDownDay.selectByIndex(10);
//		select Day from DropDown ..........
		dropDownMonth.selectByValue("10");
//		select Day from DropDown ..........
		dropDownYear.selectByVisibleText("1990");
		
//		IS Selected.....................	
		String maleRadioButtonCSSselector = "#u_0_7";
				WebElement maleRadioButton = driver.findElement(By.cssSelector(maleRadioButtonCSSselector));
				maleRadioButton.click();
				
//		get all values and store in list ..........
		List<WebElement> allElements = dropDownDay.getOptions();
		System.out.println(" value in present dropDown : ");
		for(WebElement element : allElements){
			System.out.println(element.getText());
		}
	}
}







