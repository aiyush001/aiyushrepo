package com.actitime.testscript.TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

@Listeners(com.actitime.generics.ListenerImplementation.class)
//public class TestModule extends BaseClass
public class TaskModule extends BaseClass
{
//	@Test(groups = { "smokeTest", "regressionTest"})
    @Test
	public void createTask()
	{
       Reporter.log("createTask",true);
       Assert.fail();
       Reporter.log("fail");
	}
//	@Test(groups = { "smokeTest", "regressionTest"})
	@Test
	public void deleteTask()
	{
		Reporter.log("deleteTask",true);
		Assert.fail();
	}

}
