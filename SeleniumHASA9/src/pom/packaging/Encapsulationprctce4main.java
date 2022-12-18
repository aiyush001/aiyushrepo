package pom.packaging;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encapsulationprctce4main 
{
	static
	{
		System.setProperty("WebDriver.chrome.driver", "./New folder/chromedriver.exe");
	}
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		Encapsulationprctce4 ob4=new Encapsulationprctce4(driver);
		ob4.setuser("Aiyush", "Shivhare", "aiyushshivhare@gmail.com", "123456");
		
		
	}
	

}
