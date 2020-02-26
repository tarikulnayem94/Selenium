package com.PageLoad;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class pageLoadTimeOut {

	public static void main(String[] args) {
		 
		WebElement driver = null;
		Select dis = new Select(driver);
		
		dis.selectByValue("10");
		dis.selectByVisibleText("DHAKA");
 
	}

}
