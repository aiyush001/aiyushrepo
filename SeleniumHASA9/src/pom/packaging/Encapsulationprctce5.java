package pom.packaging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Encapsulationprctce5 
{
	private WebElement usrtbx;
	private WebElement pswtbx;
	private WebElement lgnbtn;
	
	public Encapsulationprctce5 (WebDriver driver)      //constructor
	{
		usrtbx=driver.findElement(By.name("username"));
		pswtbx=driver.findElement(By.name("pwd"));
		lgnbtn=driver.findElement(By.id("loginButton"));
	}
	
     public void setvalues(String i, String j)
     {
    	 usrtbx.sendKeys(i);
    	 pswtbx.sendKeys(j);
    	 lgnbtn.click();
     }

	
		
	}

