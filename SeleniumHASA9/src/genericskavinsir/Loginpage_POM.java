package genericskavinsir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_POM 
{
	
	@FindBy(name="username")
	private WebElement usrtbx;
	
	@FindBy(name="pwd")                               //DECLARATION
	private WebElement pswtbx;
	
	@FindBy(id="loginButton")
	private WebElement lgnbtn;
	
	public Loginpage_POM  (WebDriver driver)
	{                                                                      //INITIALIZATION
		PageFactory.initElements(driver,this);              

		
	}
	
     public void setvalues(String i, String j)
     {                                                     //Utilization
    	 usrtbx.sendKeys(i);
    	 pswtbx.sendKeys(j);
    	 lgnbtn.click();
     }
}
