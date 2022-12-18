package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo2 
{
	@Test (priority=1)
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	@Test (priority=2)
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	
	@Test (priority=3)
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}

}

//Whenever we execute a test class the test methods will execute in alphabetical order,i.e, based on the testmethod name(create,delete,modify)
// in the above methods, logically first createCustomer should be executed followed by modify and then finally delete but it is not 
// happening in the desired order hence we will add a new feature called priority.
//by default all methods priority is 0 hence it gets executed in alphabetical order so we will declare the priority according to our execution
//needs. 
//priority works in ascending order .i.e,first priority will be the smallest number and so on.

//we can open the report in excel file by right clicking on report page and select export to microsoft excel and click on import and ok.
