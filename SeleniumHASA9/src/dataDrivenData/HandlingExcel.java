package dataDrivenData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//above class helps to convert the external resource file into readable file for java(It creates object of file as java understands object)
		//	It accepts path of file as an argument.File Handling concept.
		
		
		Workbook wrkbk = WorkbookFactory.create(fis);
			  String value = wrkbk.getSheet("createCustomer").getRow(2).getCell(3).getStringCellValue();
		System.out.println(value);
		
		//WorkbookFactory is a class which helps us to read data from the excel sheet...since excel sheet is based on workbook copy 
		//design hence the class name is WorkbookFactory.
		//create is a static method of WorkbookFactory class which is used to load and read data of excel sheet extension file.
		//getSheet means we are getting control of the sheet which we provide as argument
		//getRow means we are getting control of the row we are passing as an argument
		//getCell means we are getting control of the cell we are passing as an argument
		//getStringvalue means we are asking for the value of the required cell.
		//EncryptedDocumentException, this is checked exception thrown by Apachepoi whenever we try to read data from the excel sheet.
		
		
	}

}
