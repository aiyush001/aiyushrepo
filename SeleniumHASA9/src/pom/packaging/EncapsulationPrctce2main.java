package pom.packaging;

public class EncapsulationPrctce2main
{
	public static void main(String[] args) 
	{
		EncapsulationPrctce2 ob1=new EncapsulationPrctce2();
		int m=ob1.getters();               //utilization
		System.out.println(m);       
		ob1.setters(50);            //utilization
		int k= ob1.getters();       //utilization
		System.out.println(k);
	}
}


