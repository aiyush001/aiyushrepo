package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//practice question
public class TestDemo10 
{
	
		@Test(priority=1,invocationCount=2)
		                    
		public void editCustomer()
		{
			Reporter.log("editCustomer",true);
		}
		@Test
		public void registerCustomer()
		{
			Reporter.log("registerCustomer",true);
		}
		@Test
		public void deleteCustomer()
		{
			Reporter.log("deleteCustomer",true);
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
