//WAS to go to actitime page and right click on actitime link and open it in a new window
package ActionClassmethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclickclass 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("WebDriver.chrome.driver", "./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[text()='Actimind Inc.']"));
		Thread.sleep(2000);
		ac.contextClick(target).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
