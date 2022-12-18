package basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator {
public static void main(String[] args) 
{
  System.setProperty("webdriver.chrome.driver","./New folder/ChromeDriver.exe")	;
  WebDriver driver= new ChromeDriver();
   		 driver.get("file:///C:/Users/AIYUSH/Desktop/demo.html") ;
		    //WebElement e = driver.findElement(By.tagName("a"));
		    //e.click();
   		driver.findElement(By.tagName("a")).click();
}	

}
