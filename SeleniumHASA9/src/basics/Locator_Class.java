package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Class {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","./New folder/ChromeDriver.exe");
	  WebDriver driver= new ChromeDriver();
	   		 driver.get("file:///C:/Users/AIYUSH/Desktop/demo.html") ;
	   		 driver.findElement(By.className("c1")).click();

}
   }