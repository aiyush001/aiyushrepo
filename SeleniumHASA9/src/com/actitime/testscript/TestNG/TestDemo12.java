package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo12 
{
	
@Test(groups={"smokeTest","regressionTest"})
public void createCustomer()
{
	Reporter.log("createCustomer",true);
}
@Test (groups="regressionTest")
public void modifyCustomer()
{
	Reporter.log("modifyCustomer",true);
}

@Test (groups="regressionTest")
public void deleteCustomer()
{
	Reporter.log("deleteCustomer",true);
}
}
