package com.Testbasepack;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//base class
public class Testbase {
	public static Properties prop;
	public static String path;
	public static WebDriver driver;
	//constructor calling
	public Testbase()
	{
		try
		{
	//set the path of "configure.properties"
		FileInputStream sj= new FileInputStream("/Users/anku/eclipse-workspace/com.btesMarketing/src/main/java/com/configure/configure.properties");
		//Load/intialize the property class or creating an object.
		prop=new Properties();
		//now load the config file
		prop.load(sj);

		}
		//here Exception class is the main class of all exceptions
		//creating object (e)so that we can get if any exception comes(use get message)
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}
	public static void intailization()
	{
		String browsername = prop.getProperty("browser");
		//equalsignore- ignore the upper & lower case alphabets,if any;
		if (browsername.equalsIgnoreCase("chrome"))
		{
			path=System.getProperty("user.dir")+ prop.getProperty("systemproperty_2");
			System.setProperty(prop.getProperty("systemproperty_1"), path);
			System.out.println(path);
			driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	

}
