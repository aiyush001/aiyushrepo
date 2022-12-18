package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {
	public static void main(String[] args) throws InterruptedException
	{
	   System.setProperty("WebDriver.chrome.driver", "./Newfolder/ChromeDriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com/signup");
	   driver.findElement(By.name("firstname")).sendKeys("Aiyush");
	   Thread.sleep(2000);
	   driver.findElement(By.name("lastname")).sendKeys("Shivhare");
	   Thread.sleep(2000);
	   driver.findElement(By.name("reg_email__")).sendKeys("ashivhare@rediffmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
	   Thread.sleep(2000);
	   WebElement dd = driver.findElement(By.id("day"));
	   Select sel=new Select(dd);
	   sel.selectByValue("7");
	   Thread.sleep(2000);
	   WebElement selmon = driver.findElement(By.id("month"));
	   Select sel1=new Select(selmon);
	   sel1.selectByValue("4");
	   Thread.sleep(2000);
	   WebElement selyear = driver.findElement(By.id("year"));
	   Select sel2=new Select(selyear);
	   sel2.selectByValue("1996");
	   Thread.sleep(2000);
	  WebElement but = driver.findElement(By.xpath("//input[@value='2']"));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", but);
	  Thread.sleep(2000);
	   driver.findElement(By.name("websubmit")).click();
	   
	   
	   //js.executeScript("arguments[0].click()", click);
	    
	   
	   
	}

}
