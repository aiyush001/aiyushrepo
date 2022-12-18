package Assignmentsnew;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshorpractice 
{
	static
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chrome.driver.exe");
	}
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AIYUSH/Desktop/dropdown%20select%20class.html");
		TakesScreenshot scr=(TakesScreenshot)driver;
		File file=scr.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("C:\\Users\\AIYUSH\\Desktop\\ERRORSHOTS\\Dropdowncalss01"));
		driver.quit();
		
	}

}
