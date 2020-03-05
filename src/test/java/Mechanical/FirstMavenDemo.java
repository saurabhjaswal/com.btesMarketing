package Mechanical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class FirstMavenDemo {
	public static String path;
public static WebDriver driver;
@BeforeSuite

public void launch() 

{
path=System.getProperty("user.dir")+ "/WEbDriver/chromedriver";
System.out.println(path);
System.setProperty("webdriver.chrome.driver",path);
driver=new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
}

@AfterSuite
public void driver_close()
{
	driver.close();
}

}
