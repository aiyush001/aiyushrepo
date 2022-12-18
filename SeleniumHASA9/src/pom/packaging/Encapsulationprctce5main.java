package pom.packaging;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encapsulationprctce5main 
{
	static
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chromebrowser.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		Encapsulationprctce5 ob5=new Encapsulationprctce5(driver);
	//	ob5.setvalues("Admin1","manager");
		Thread.sleep(4000);
		ob5.setvalues("Admin","manager");
		
		
		
	}

}
