package Mechanical;

import org.testng.Assert;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Diff.B/W Hard & Soft:
//Both Assertion are same only Soft assertion will continue with test/next statement after failing.
public class SoftAssertscript {
@Test
public void testSoft()
{
	//create an Object of SoftAssert
	SoftAssert sj=new SoftAssert();
	System.out.println("test1 started");
 //Note:if this validation doesn't match/fail(actual,expect),still it will execute the next statement. 
	sj.assertEquals(22, 42,"count doesn't match");//"error message"
	System.out.println("test1 completed");
	//Note: if v will not call this Assert All method Soft assert will not perform as expected.
	sj.assertAll();
}

//applying HardAssert
@Test
public void TestHardAssert()
{
	
	System.out.println("test2 started");
	//Note: if this validation doesn't match/fail(actual,expect),it will not execute the next statement.
	Assert.assertEquals(22, 42,"count doesn't match");
	System.out.println("test2 completed");
}
}
