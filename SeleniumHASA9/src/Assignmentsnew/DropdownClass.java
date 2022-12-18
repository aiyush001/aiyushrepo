package Assignmentsnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./New folder/ChromeDriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("file:///C:/Users/AIYUSH/Desktop/dropdown%20select%20class.html");
		 WebElement dd = driver.findElement(By.id("multiple"));
		 Select sel=new Select(dd);
		 System.out.println(sel.isMultiple());
		 
		  //--------------------------------------
		 sel.selectByIndex(1);
		 Thread.sleep(2000);
		 sel.selectByVisibleText("java");
		 Thread.sleep(2000);
		 sel.selectByValue("4");
		 Thread.sleep(2000);
		 sel.deselectByIndex(1);
		 Thread.sleep(2000);
		 sel.deselectByVisibleText("java");
		 Thread.sleep(2000);
		  
		  
		  
		  
		  
		  
		  
		  
		 driver.close();
	}
	
}
