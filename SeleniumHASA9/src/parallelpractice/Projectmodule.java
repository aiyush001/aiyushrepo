package parallelpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.ParallelBaseClass;

public class Projectmodule 
{
	@Test
	public void createProject()
	{
		Reporter.log("createProject",true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("deleteProject",true);
	}

}
