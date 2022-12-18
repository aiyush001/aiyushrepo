package Assignmentsnew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectallURL 
{
	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.chrome.driver","./New folder.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		List<WebElement> allurls=driver.findElements(By.xpath("//a"));
		for(int i=0;i<allurls.size();i++)
		{
			String listofurl=allurls.get(i).getAttribute("href");
			System.out.println(listofurl);
			
		}
		
	}

}
