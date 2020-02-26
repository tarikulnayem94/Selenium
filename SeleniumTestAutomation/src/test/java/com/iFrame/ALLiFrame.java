package com.iFrame;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ALLiFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bb\\Desktop\\JavaCode"
				+ "\\SeleniumTestAutomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		int size = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i <=size; i++) {
			driver.switchTo().frame(i);
			int total = driver.findElements(By.xpath("/html/body")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		
		}
	}
}


