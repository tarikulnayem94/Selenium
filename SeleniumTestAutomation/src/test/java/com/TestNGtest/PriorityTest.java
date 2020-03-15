package com.TestNGtest;
import org.testng.annotations.Test;
public class PriorityTest 
{
	@Test(priority = 4)
	public void test_1() {
		System.out.println("Execute Test_1 ");
	}
	@Test(priority = 2)
	public void test_2() {
		System.out.println("Execute Test_2 ");
	}
	@Test(priority = 1)
	public void test_3() {
		System.out.println("Execute Test_3 ");
	}
	@Test(priority = 3)
	public void test_4() {
		System.out.println("Execute Test_4 ");
	}
	@Test(priority = -1)
	public void test_5() {
		System.out.println("Execute Test_5 ");
	}
}

