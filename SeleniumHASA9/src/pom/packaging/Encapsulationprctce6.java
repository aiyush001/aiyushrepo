
//ActiTime Demo login page using POM page

package pom.packaging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;                                        //POM PAGE
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Encapsulationprctce6                      //POM PAGE
{
	
	@FindBy(name="username")
	private WebElement usrtbx;
	
	@FindBy(name="pwd")                               //DECLARATION
	private WebElement pswtbx;
	
	@FindBy(id="loginButton")
	private WebElement lgnbtn;
	
	public Encapsulationprctce6 (WebDriver driver)
	{                                                                      //INITIALIZATION
		PageFactory.initElements(driver,this);              

		//this keyword is a keyword in java which holds the current class object
		// and it is because of this keyword that we don't get StaleElement exception
	   //even if we enter wrong credentials.
	 //whenever wrong credentials are entered the page gets refreshed automatically and as a result the address
	// of the current element will change but as we are using an inbuilt method initElements which accepts two 
	//arguments reference of the browser which is "driver" and reference or address of element of the current page which is the POM
	// page which is represented by inbuilt keyword known as "this" . We are using initElements method because it initializes the element
	//only during runtime or when action is performed and this phenomenon is known as lazy initialization.
	}
	
     public void setvalues(String i, String j)
     {
    	 usrtbx.sendKeys(i);
    	 pswtbx.sendKeys(j);
    	 lgnbtn.click();
     }


}
