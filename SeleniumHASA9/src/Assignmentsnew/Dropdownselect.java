package Assignmentsnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		WebElement monthlist = driver.findElement(By.id("month"));
		Select s=new Select(monthlist);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("1");
		Thread.sleep(2000);
		s.selectByVisibleText("Feb");
		Thread.sleep(2000);
		driver.close();
	}

}
