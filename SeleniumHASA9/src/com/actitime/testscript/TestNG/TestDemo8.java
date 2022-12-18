package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo8 
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
  }
//Here @Test is the only test case where as @BeforeMethod and @AfterMethod are the configuration methods whose message we can see only in
//console screen.In real time only those methods are executed which are under @Test annotation.
//@BeforeMethod means that before the test case is executed the message in @BeforeMethod annotation will be displayed in console and then @Test
//will be executed based on the alphabetical order(or priority or any other condition if provided).Finally the message under @AfterMethod 
//annotation will be displayed.
//If any more @Test is present in the test class than the same process will be repeated.
