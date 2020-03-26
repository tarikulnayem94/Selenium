package com.BrowserOption;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class SecuredCertificateOn {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");

		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));

//		Secured Certificate Accept................................
		fo.setAcceptInsecureCerts(true);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cacert.org/index.php?id=1");
		
		
	}

}


