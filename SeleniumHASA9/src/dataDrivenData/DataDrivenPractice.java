 //WAS to read a data from a property file
package dataDrivenData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.actitime.generics.FileLib;

/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfilepractice {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String var = p.getProperty("url");
		System.out.println(var);
		

	}

}
*/
public class DataDrivenPractice
{
	static
	{
		System.setProperty("WebDriver.chrome.drievr","./New folder/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException 
	{
		FileLib obj=new FileLib();
		System.out.println(obj.getPropertyValue("url"));
		System.out.println(obj.getPropertyValue("username"));
		System.out.println(obj.getPropertyValue("password"));
		System.out.println(obj.getExcelData("CreateCustomer", 2, 2));
	      obj.writeExcelData("CreateCustomer", 2, 3, "demo");
	}
		
}
