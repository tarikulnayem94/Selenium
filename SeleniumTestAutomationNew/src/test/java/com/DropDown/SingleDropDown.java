package com.DropDown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class SingleDropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
//		Find dropDown Day.......................................
		WebElement dropDownEelementDay = driver.findElement(By.name("birthday_day"));
		WebElement dropDownEelementMonth = driver.findElement(By.name("birthday_month"));
		WebElement dropDownEelementYear = driver.findElement(By.name("birthday_year"));

//		create object for select class........................
		Select dropDownDay = new Select(dropDownEelementDay);
		Select dropDownMonth = new Select(dropDownEelementMonth);
		Select dropDownYear = new Select(dropDownEelementYear);
		
//		verify dropDown single or multiple............................
		boolean singleOrMultiple = dropDownDay.isMultiple();
		if (singleOrMultiple) {
			System.out.println("dropDown is multiple value dropDown");
		} else {
			System.out.println("dropDown is single value dropDown");
		}	
//		select day from dropDown....................................
		dropDownDay.selectByIndex(10);
		dropDownMonth.selectByIndex(10);
		dropDownYear.selectByValue("1994");
		
//		get all values and stored in list...........................
		List<WebElement> allElements = dropDownDay.getOptions();
		System.out.println("List all elements : ");
		
		for(WebElement element : allElements){
			System.out.println(element.getText());
		}
		
	}
	
}


