package com.actitime.testscript.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo1
{
	@Test
	
	public void demoA()
	{
		Reporter.log("demoA",true);
	}
	
	@Test
	
	public void demoB()
	{
		Reporter.log("demoB",false);
	}
}


//@Test is known as test method.
//TestDemo1 is known as test class as it contains test method.
//All methods in test class are non-static
//In test class we use Reporter.log() instead of sop statement.
//If we use true beside the printing statement then we will get the output in both  console and our report page.
//If we use false or don't use either true or false then we will get the output(i.e., the sop statement) only in the reports but not in console
//Once we run the test class successfully then we need to refresh our project(SeleniumHASA9),on doing this a folder called test-output is 
//automatically generated, on clicking that several options will show up but in order to view the report we need to right click on 
//emailable-report.html option and select open with browser, upon successfully completing this steps a report will open in the browser.