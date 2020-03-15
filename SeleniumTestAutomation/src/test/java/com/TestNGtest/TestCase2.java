package com.TestNGtest;

import org.testng.annotations.Test;

public class TestCase2 extends TestBase {
	@Test
	public void f() {
		driver.get("https://www.demo.opencart.com");
		System.out.println(driver.getTitle());
	}

}
