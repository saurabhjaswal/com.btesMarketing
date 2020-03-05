package Mechanical;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void check()
	{
		System.out.println("test case 1 started");
//applying hard assert means even if a single assert fails, it will terminate the program/next statement.
		//ERROR message-(Actual,Expected,"it will only displayed when test fails")
		Assert.assertEquals(12,13,"dropdown count doesn't match plz check with devolper");
		System.out.println("test case 1 completed");
	}
	@Test
	public void check1()
	{
		System.out.println("test case 2 started");
		//applying hard assetion if Assert passes it will execute the next statement(Actual,expected).
		Assert.assertEquals(12,12,"dropdown count doesn't match plz check with devolper");
		System.out.println("test case 2 completed");
	}
	@Test
	public void check2()
	{
		System.out.println("test case 3started");
		//applying hard assetion
		Assert.assertEquals(12,14,"dropdown count doesn't match plz check with devolper");
		System.out.println("test case 3 completed");
	}
	
}
