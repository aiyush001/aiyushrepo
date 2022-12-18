package Selectdropdownpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown001 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("WebDriver.chrome.driver","./New folder/chromwedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("file:///C:/Users/AIYUSH/Desktop/dropdown%20select%20class.html");
		 WebElement multi = driver.findElement(By.id("multiple"));
		 Select s=new Select(multi);
		 System.out.println(s.isMultiple());
		 Thread.sleep(2000);
		 s.selectByIndex(0);
		 Thread.sleep(2000);
		 s.selectByIndex(1);
		 Thread.sleep(2000);
		 s.selectByIndex(2);
		 Thread.sleep(2000);
		 s.deselectByIndex(1);
		 Thread.sleep(2000);
		 WebElement firstselected = s.getFirstSelectedOption();
		 System.out.println(firstselected.getText());
		 List<WebElement> allselect = s.getAllSelectedOptions();
		 for(int i=0;i<allselect.size();i++)
		 {
			 System.out.println(allselect.get(i).getText());
		 }
		 List<WebElement> alloptions = s.getOptions();
		 for(int i=0;i<alloptions.size();i++)
		 {
			 System.out.println(alloptions.get(i).getText());
		 }
		 driver.close();
		
	}

}
