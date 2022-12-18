package Assignmentsnew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllLink 
{
	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.chrome.driver", "./New folder/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		System.out.println("-------------------------------------------");
		for(int i=0;i<alllinks.size();i++)
		{
			String listoflinks=alllinks.get(i).getText();
			System.out.println(listoflinks);
		}
		driver.close();
		
	}

}
