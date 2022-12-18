//WAS to drag and drop block 1 in position of block 4 in the below url 
package ActionClassmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Actions ac=new Actions(driver);
		WebElement dragsrc = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement drpdest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Thread.sleep(3000);
		ac.dragAndDrop(dragsrc, drpdest).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
