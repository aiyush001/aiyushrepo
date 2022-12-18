package Assignmentsnew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentofWebTable
{
	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AIYUSH/Desktop/subjectdemo.html");
		List<WebElement> webtablecontentlist = driver.findElements(By.xpath("//td"));
		for(int i=0;i<webtablecontentlist.size();i++)
		{
			String listofcontent=webtablecontentlist.get(i).getText();
			System.out.println(listofcontent);
		}
		driver.close();
	}

}
