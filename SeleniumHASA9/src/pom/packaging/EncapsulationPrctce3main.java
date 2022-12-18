package pom.packaging;

public class EncapsulationPrctce3main 
{
	public static void main(String[] args) 
	{
		EncapsulationPrctce3 ob3=new EncapsulationPrctce3(10);
		int k=ob3.getvalue();
		System.out.println(k);
		ob3.setvalue(50);             //utilization
		int p= ob3.getvalue();        //utilization
		System.out.println(p);
		
	}

}
