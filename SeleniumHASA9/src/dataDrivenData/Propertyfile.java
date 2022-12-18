package dataDrivenData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\AIYUSH\\Desktop\\commondata.property");
		
	//above class helps to convert the external resource file into readable file for java(It creates object of file as java understands object)
	//	It accepts path of file as an argument.File Handling concept.
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty("password");
		System.out.println(data);
		
		//Properties is a class which helps us to read data from property extension file
		//p.load is a nonstatic method of properties class which will accept the properties extension file whose data we want to read
		//p.getproperty is a nonstatic method of properties class which gives the value of the key which we pass as an argument
		
		

	}

}
