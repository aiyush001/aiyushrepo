package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo4
{
	@Test (invocationCount=2)
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);

	}
	@Test ()
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	
	@Test ()
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}

}

//Here we are using another feature called invocationCount which means the number of times we want to execute a test case.
//By default invocation count is 1, if we give invocationCount as 0 or (-ve) value then that test case will not be executed
//we cannot provide fraction or decimal number in invocationCount.
//In the above example createCustomer method will execute twice.
