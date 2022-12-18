package com.actitime.testscript.TestNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class Customermodule 
{
	//@Test(priority=1,invocationCount=2)
	@Test(groups = { "smokeTest", "regressionTest"})
	public void editCustomer()
	{
		Reporter.log("editCustomer",true);
	}
	@Test(groups = "regressionTest")
	public void registerCustomer()
	{
		Reporter.log("registerCustomer",true);
	}
	@Test(groups ="regressionTest")
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
	
	
}
