package com.Keyboard_Mouse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class DrugDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

//		driver.findElement(By.id("box1"));
		WebElement drag = driver.findElement(By.id("box1"));
		WebElement drop = driver.findElement(By.id("box101"));
		
//		WebElement c = driver.findElement(By.id("box2"));
//		WebElement d = driver.findElement(By.id("box102"));
//		
//		WebElement e = driver.findElement(By.id("box3"));
//		WebElement f = driver.findElement(By.id("box103"));
//		
//		WebElement g = driver.findElement(By.id("box4"));
//		WebElement h = driver.findElement(By.id("box104"));
//		
//		WebElement i = driver.findElement(By.id("box5"));
//		WebElement j = driver.findElement(By.id("box105"));
//		
//		WebElement k = driver.findElement(By.id("box6"));
//		WebElement l = driver.findElement(By.id("box106"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop);
		actions.perform();
	    }
//	    public static void useDragDrop (String drag, String drop){
//			WebDriver driver= new FirefoxDriver();
//			Actions actions = new Actions(driver);
//			actions.dragAndDrop(drag, drop);
//			actions.perform();
//	    }
}

