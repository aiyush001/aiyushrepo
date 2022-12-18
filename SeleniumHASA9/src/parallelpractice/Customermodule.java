package parallelpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.ParallelBaseClass;

public class Customermodule 
{
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}

}
