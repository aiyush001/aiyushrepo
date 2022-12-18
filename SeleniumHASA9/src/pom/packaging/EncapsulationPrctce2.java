package pom.packaging;

public class EncapsulationPrctce2 
{
	private int i;                              //declaration
	
	
	
public EncapsulationPrctce2()                    //non-parametarized constructor
{
	i=10;                                       //initialization inside constructor
}

public int getters()
{
	return i;                                    //getters method is used only for read access
}

public void setters(int j)
{                                       
	i=j;                                        //Setters method is used to the values by the user accessing the main method page
	                                            //i.e., write access to the user is provided.
}
}




//This is the second concept of encapsulation where we are using both getters method and setters method to give read accessibility as
//well as authority to the user to write or make any changes to the current data .
