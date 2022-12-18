package Javasriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabledbutton 
{
  public static void main(String[] args) 
  {
	System.setProperty("WebDriver.chrome.driver","./New folder/chrome.driver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/AIYUSH/Desktop/disabled.html");
	driver.findElement(By.id("d1")).sendKeys("Admin");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('d2').value='manager'");
	
  }
}
