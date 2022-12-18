package Javasriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.chrome.Driver","./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0,4000)");
         driver.close(); 
	}

}
