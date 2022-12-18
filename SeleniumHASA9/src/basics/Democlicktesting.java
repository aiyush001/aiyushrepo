package basics;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlicktesting {
public static void main(String[] args) throws InterruptedException
{
	 System.setProperty("WebDriver.chrome.driver", "./Newfolder/ChromeDriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.get("https://www.myntra.com/");
	   Thread.sleep(2000);
	  // Action action =new Action(driver);
	   driver.findElement(By.xpath("desktop-searchBar")).sendKeys("shoe");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	   driver.close();
}
}
