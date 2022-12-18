package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo5 
{
 @Test(priority=2)
 public void createCustomer()
 {
	 Reporter.log("createCustomer",true);
 }
 @Test(priority=1,dependsOnMethods="createCustomer")
 public void deleteCustomer()
 {
	 Reporter.log("deleteCustomer",true);
 }
}

//Whenever the compiler has to chose between priority and dependsOnMethods it will first execute dependsOnMethods.
//In the above example even though deleteCustomer method has high priority but still createCustomer will execute first as deleteCustomer
//method is dependent on createCustomer method.