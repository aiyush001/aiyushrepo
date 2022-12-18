package Assignmentsnew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectallcheckbox 
{
	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("");
		List<WebElement> listofcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<listofcheckbox.size();i++)
		{
			listofcheckbox.get(i).click();
		}
		driver.close();
	}

}
