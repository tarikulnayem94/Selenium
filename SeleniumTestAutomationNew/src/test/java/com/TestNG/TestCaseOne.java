package com.TestNG;
import org.testng.annotations.Test;

public class TestCaseOne {

	@Test (groups = {"TestBaseTest"})
	public void SimpleTest() 
	{
		System.out.println("@TSimple Test TestCaseOne executing...........");
		System.out.println("@Test executed Successfully.");
	}

}
