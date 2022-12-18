package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo7
{
	@Test (priority=1,invocationCount=2)
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);

	}
	@Test (priority=2,dependsOnMethods="createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	
	@Test (priority=3,dependsOnMethods="createCustomer")
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}

}
