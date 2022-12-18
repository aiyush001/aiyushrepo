package pom.packaging;

public class Encapsulationprctce1
{
  private int i;                                  //declaration
  
  
  
  public Encapsulationprctce1()                  //non-parametarized constructor
  {
	  i=10;                                    //initialization inside constructor
  }
  
  public int getters()                      //getters method is used only for read access
  {
	  return i;
  }
}


//This is the first and basic concept of encapsulation where we are using only getters method to give only read accessibility.
// This page is controlled by the admin and we have only used setters method so that any new joinee cannot make any changes to the existing data
// They can use this class to read the values only in another class