//FB signup page using encapsulation

package pom.packaging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Encapsulationprctce4 
{
	//declaration
	private WebElement frstnm;
	private WebElement lstnm;
	private WebElement email;
	private WebElement pswd;
	private WebElement day;
	private WebElement month;
	private WebElement year;
	private WebElement gender;
	private WebElement sign;
	
	//initialization
	public Encapsulationprctce4(WebDriver driver)
	{
		 frstnm=driver.findElement(By.name("firstname"));
		 lstnm=driver.findElement(By.name("lastname"));
		 email=driver.findElement(By.name("reg_email__"));
		 pswd=driver.findElement(By.name("reg_passwd__"));
		 day=driver.findElement(By.id("day"));
		month=driver.findElement(By.id("month"));
		year=driver.findElement(By.id("year"));
		gender=driver.findElement(By.xpath("//input[@value='2']"));
		sign=driver.findElement(By.name("websubmit"));
	}
	
	
    //business logic
	public void setuser(String j, String k, String l, String m)
	{
		
		frstnm.sendKeys(j);
		lstnm.sendKeys(k);
		email.sendKeys(l);
		pswd.sendKeys(m);
		Select sel=new Select(day);
		sel.selectByValue("7");
		Select mon=new Select(month);
		mon.selectByValue("4");
		Select yr=new Select(year);
		yr.selectByValue("1996");
		gender.click();
		sign.click();
	}

	
		
}


