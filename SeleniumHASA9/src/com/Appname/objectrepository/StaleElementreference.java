//Sript for staleelement reference exception

package com.Appname.objectrepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementreference 
{
	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement untxtbox = driver.findElement(By.xpath("//input[@id='username']"));
		driver.navigate().refresh();
		untxtbox.sendKeys("admin");
	}

}
//in this example as we identify the webelement of textbox it is stored in one of the memory location having a fixed address and that address is
//being referred by a variable named as untxtbox, if we send the value by sendkeys immediately without any refresh action then the 
//execution will happen normally but before sending the key value we are performing refresh action as a result of which the textbox gets stored
//in a new memory location having a new address(shuffling happens) but the variable untxt is still referring to the old address and now if we send  
//a value, it will go the address where untxtbox is pointing which is the old address, but in that memory location address there is no username
//textbox present as it has moved to a new memory location having new address,hence it will throw staleelementexception indicating that the 
//username textbox was stored in this address earlier but now it's address is different.
