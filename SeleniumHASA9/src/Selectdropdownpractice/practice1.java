//WAS to show your date of birth in FB sign up page using index,select by value,select by visible text for day, month ,year respectively.
package Selectdropdownpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice1 
{
   public static void main(String[] args) throws InterruptedException 
   {
	 System.setProperty("WebDriver.chrome.driver","./New folder/chromwedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.get("https://en-gb.facebook.com/signup");
	 WebElement dayoption = driver.findElement(By.id("day"));
	 Select cl1=new Select(dayoption);
	 cl1.selectByIndex(6);
	 Thread.sleep(2000);
	 WebElement monthoption = driver.findElement(By.id("month"));
	 Select cl2=new Select(monthoption);
	 cl2.selectByValue("4");
	 Thread.sleep(2000);
	 WebElement yearoption = driver.findElement(By.id("year"));
	Select cl3=new Select(yearoption);
	cl3.selectByVisibleText("1996");
	Thread.sleep(2000);
	driver.close();
   }
}
