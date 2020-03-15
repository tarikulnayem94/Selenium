package com.TestNGtest;
import org.testng.annotations.Test;

public class TestCase1 extends TestBase {
	@Test
	public void SimpleTest() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
