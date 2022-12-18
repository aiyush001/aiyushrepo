package Assignmentsnew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {
	static
	{
		System.setProperty("WebDriver.chrome.driver", "./New folder/chrome.driver.exe");
	}
	@Test
	public void testScreenshot() throws IOException
	{
	   WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//typecast the object to access the method
		TakesScreenshot scr=(TakesScreenshot)driver;
		//Take the screenshot in file format
		File srce=scr.getScreenshotAs(OutputType.FILE);
		//Open the empty file in current java project
		File dest=new File("./Screenshot/img001.png");
		//copy paste the screenshot and save the file in above location
		FileUtils.copyFile(srce, dest);
		driver.close();
	    
	}

}
