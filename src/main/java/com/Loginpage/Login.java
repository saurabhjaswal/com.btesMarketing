package com.Loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testbasepack.Testbase;

//Also called pages bcz it contains Locators and Methods
public class Login extends Testbase {
	
//here we can use driver.findElemnet but for that we have to create a return type method
//so to avoid upper step we have to use Page Factory property by using Locators
	
	@FindBy (id="txtUsername")
	WebElement Username;
	@FindBy (id="txtPassword")
	WebElement Password;
	@FindBy(id="btnLogin")
	WebElement LoginButton;
	//constructor calling
	public Login()
	{
		PageFactory.initElements(driver, this);
		//here "this" denotes the locators.eg@FindBy (id="txtUsername")
		//WebElement Username;
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public void verifylogin()
	{
		Username.sendKeys(prop.getProperty("username"));
		Password.sendKeys(prop.getProperty("password"));
		LoginButton.click();
		driver.navigate().back();	
	}
		
}
