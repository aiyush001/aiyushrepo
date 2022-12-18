package Assignmentsnew;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlignment {
	static
	{
		System.setProperty("WebDriver.chrome.driver", "./Newfolder/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/login/");
	   Point userdim = driver.findElement(By.id("email")).getLocation();
	   Point passdim = driver.findElement(By.id("pass")).getLocation();
	   int userx1 = userdim.getX();
	   int usery1=userdim.getY();
	   int passx1=passdim.getX();
	   int passy1=passdim.getY();
	   if(userx1==passx1 && usery1==passy1)
	   {
		   System.out.println("username and password tab of facebook are aligned  :"+"pass");
	   }
	   else
	   {
		   System.out.println("username and password tab of facebook are not aligned  :"+"fail");
	   }
	   System.out.println(userx1);
	   System.out.println(passx1);
	   System.out.println(usery1);
	   System.out.println(passy1);
	}
}
