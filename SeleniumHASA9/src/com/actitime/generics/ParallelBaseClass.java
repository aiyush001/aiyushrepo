package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ParallelBaseClass
{
	static
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromedriver.exe");
		System.setProperty("WebDriver.chrome.driver","./New folder/chromedriver.exe");
	}
	
	//public static WebDriver driver;
	public WebDriver driver;
	

	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
   
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
	
  
   @AfterMethod
    public void logout()
    {
    	Reporter.log("logout",true);
    	driver.findElement(By.id("logoutLink")).click();
    }
    
  
   @AfterTest
    public void closeBrowser()
    {
    	Reporter.log("cloaseBrowser",true);
    	driver.close();
    }
     

}
