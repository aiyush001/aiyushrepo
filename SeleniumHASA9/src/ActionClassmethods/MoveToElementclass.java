//WAS to go to vtiger website and hover the mouse to rerource and click on contact and  print the bangalore location number in console from there

package ActionClassmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementclass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("/html/body/nav/div/div/div/ul/li[5]/a"));
		ac.moveToElement(target).perform();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Contact Us")).click();
		Thread.sleep(1000);
		String phoneno = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		Thread.sleep(1000);
		System.out.println(phoneno);
		driver.close();
	}

}
