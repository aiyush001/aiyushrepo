package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class TestDemo11 extends BaseClass
{
	@Test 
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	@Test 
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	
	/*@Test 
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
	*/

}
