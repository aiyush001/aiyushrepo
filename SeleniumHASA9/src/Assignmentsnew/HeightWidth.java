package Assignmentsnew;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	static
	{
		System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Dimension usersize = driver.findElement(By.id("email")).getSize();
		Dimension passsize = driver.findElement(By.id("pass")).getSize();
		int heightu1 = usersize.getHeight();
		int widthu1 = usersize.getWidth();
		int heightp1=passsize.getHeight();
		int widthp1=passsize.getWidth();
		
		if(heightu1==heightp1 && widthu1==widthp1)
		{
			System.out.println("Height and width are of same size :"+"pass");
		}
		else
		{
			System.out.println("Height and width are not of same size :"+"fail");
		}
		System.out.println(heightu1);
		System.out.println(heightp1);
		System.out.println(widthu1);
		System.out.println(widthp1);
	}
	

}
