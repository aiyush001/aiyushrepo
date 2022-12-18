package pom.packaging;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Encapsulationprctce6main 
{
	static
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromebrowser.exe");
	}
	@Test
	//public static void main(String[] args) throws InterruptedException
	public  void loginpage() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		Encapsulationprctce6 ob6=new Encapsulationprctce6(driver);
		ob6.setvalues("Admin1","manager");
		Thread.sleep(5000);
		ob6.setvalues("Admin","manager");
		
		
		
	}

}
