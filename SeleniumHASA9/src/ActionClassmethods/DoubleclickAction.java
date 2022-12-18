package ActionClassmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chrome.driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		Actions ac=new Actions(driver);
		Thread.sleep(2000);
		WebElement hover = driver.findElement(By.xpath("/html/body/nav/div/div/div/ul/li[5]/a"));
		ac.moveToElement(hover).perform();
		Thread.sleep(2000);
		  driver.findElement(By.partialLinkText("Customers")).click();
		  Thread.sleep(2000);
		 WebElement dblclk = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/a"));
		 ac.doubleClick(dblclk).perform();
		
		
	}

}
