package parallelpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.ParallelBaseClass;

public class Taskmodule 
{
	@Test
	public void createTask()
	{
		Reporter.log("createTask",true);
	}
	@Test
	public void deleteTask()
	{
		Reporter.log("deleteTask",true);
	}

}
