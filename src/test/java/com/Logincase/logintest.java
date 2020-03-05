package com.Logincase;

//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.Loginpage.Login;
import com.Testbasepack.Testbase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class logintest extends Testbase {
//creating login class Reference variable
	Login low;
	//creating constructor
	public logintest()
	{
		//here Super keyword will call the base class constructor
		super();
	}
	@BeforeSuite 
	public void setup()
	//method calling of the testbase class
	{
	intailization();
	low =new Login();
	}
	@Test
	public void verifytitletest()
	{
		//calling the method of loginclass
		String title= low.verifyTitle();
		AssertJUnit.assertEquals(title, "OrangeHRM");
	}
	@Test
	public void verifyLogintest()
	{
		low.verifylogin();
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
