package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser1 {
	
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe");
	ChromeDriver refvar=new ChromeDriver();
	refvar.get("https://www.instagram.com/accounts/login/");
	refvar.findElement(By.className("_aa4b _add6 _ac4d")).sendKeys("Aiyush");
	refvar.findElement(By.className("_aa4b _add6 _ac4d")).sendKeys("1234");
	refvar.findElement(By.className("_acan _acap _acas")).click();
	//refvar.close()

}
}
