package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo3 
{
	@Test 
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	int i=1/0;
	}
	@Test (dependsOnMethods="createCustomer")
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	
	@Test (dependsOnMethods="createCustomer")
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
}

//dependsOnMethods is a feature used when we want dependency in our test case execution.
// In the above example we are using dependsOnMethods="createCustomer" feature in modifyCustomer and deleteCustomer method which means that 
// these two test methods will execute only if createCustomer method will execute successfully.If createCustomer fails then the other two 
//test methods will get skipped.
