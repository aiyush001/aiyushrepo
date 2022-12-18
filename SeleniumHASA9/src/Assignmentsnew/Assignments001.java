//WAS to copy the textname from username textbox and paste it into the password textbox in open source billing box
package Assignmentsnew;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments001 {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
	       Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		 Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		 Thread.sleep(2000);
		driver.close();
		
	       
		}

	

}
