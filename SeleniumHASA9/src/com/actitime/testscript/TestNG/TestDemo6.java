package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo6 
{
	 @Test(dependsOnMethods="deleteCustomer")
	 public void createCustomer()
	 {
		 Reporter.log("createCustomer",true);
	 }
	 @Test(dependsOnMethods="createCustomer")
	 public void deleteCustomer()
	 {
		 Reporter.log("deleteCustomer",true);
	 }

}

//When two methods are dependent on each other then we get an exception called Testng exception and the error called cyclic dependencies.
