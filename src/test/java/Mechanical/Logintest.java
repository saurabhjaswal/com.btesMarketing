package Mechanical;

//import org.testng.annotations.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Logintest extends FirstMavenDemo{
	
	@Test
	public void log() 
	{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}
}
