package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo9 
{
	@Test
	public void testCreateCustomer()
	{
		Reporter.log("CreateCustomer",true);
	}
     @Test
     public void testDeleteCustomer()
     {
    	 Reporter.log("DeleteCustomer",true);
     }
     @BeforeMethod
     public void login()
     {
    	 Reporter.log("login",true);
     }
     @AfterMethod
     public void logout()
     {
    	 Reporter.log("logout",true);
     }
     @BeforeClass
     public void openbrowser()
     {
    	 Reporter.log("openbrowser",true);
     }
     @AfterClass
     public void closebrowser()
     {
    	Reporter.log("closebrowser");
     }
}
//Both test case belong to same class so first beforeclass method message will be displayed followed by beforemethod,@test and after method
//message will be displayed. As there is another test method so same process will be repeated starting from beforemethod message follwed by 
//executing test method and then Aftermethod, and finally afterclass message will be displayed.
