package com.TestNG;
import org.testng.annotations.Test;

public class TestCaseTwo {

	@Test (groups = {"TestBaseTest"})
	public void SimpleTest() 
	{
		System.out.println("@TSimple Test TestCaseTwo executing...........");
		System.out.println("@Test executed Successfully.");
	}
}
