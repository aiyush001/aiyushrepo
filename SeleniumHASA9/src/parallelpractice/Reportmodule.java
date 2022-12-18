package parallelpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.ParallelBaseClass;

public class Reportmodule 
{
	@Test
	public void createReport()
	{
		Reporter.log("createReport",true);
	}
	@Test
	public void deleteReport()
	{
		Reporter.log("deleteReport",true);
	}


}
