package com.actitime.generics;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	
	static
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromedriver.exe");
	}
	
	//public WebDriver driver;
	public static WebDriver driver;
	
	//@BeforeClass(groups = { "smokeTest", "regressionTest"})
	@BeforeClass
	//@BeforeTest
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
   //@BeforeMethod(groups = { "smokeTest", "regressionTest"})
	@BeforeMethod
   public void login() throws IOException
   {
		
	  Reporter.log("login",true);
	  driver.get("https://demo.actitime.com/login.do");
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	 // driver.findElement(By.xpath("//div[.='login']")).click();
	  driver.findElement(By.id("loginButton")).click();
     }
	
   // @AfterMethod(groups = { "smokeTest", "regressionTest"})
   @AfterMethod
    public void logout()
    {
    	Reporter.log("logout",true);
    	driver.findElement(By.id("logoutLink")).click();
    }
    
   // @AfterClass(groups = { "smokeTest", "regressionTest"})
   @AfterClass
   //@AfterTest
    public void closeBrowser()
    {
    	Reporter.log("cloaseBrowser",true);
    	driver.close();
    }
     
}

//This class is required because it contains all the configuration methods and instead of writing these methods everytime in a test class we
//can simply extend those test classes with this BaseClass.This shows the real use of inheritance concept.
//for example if we are having 100 test class then we will have to write all these configuration methods in all the 100 test classes but we can
//avoid that by creating this base class as this increases the code resuability and saves time.
