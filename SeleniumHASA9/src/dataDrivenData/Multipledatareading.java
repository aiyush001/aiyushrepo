package dataDrivenData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multipledatareading 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	int rowcount = wb.getSheet("LoginPage").getLastRowNum();
	int cellcount=wb.getSheet("LoginPage").getRow(1).getLastCellNum();
	for(int i=1;i<=rowcount;i++)
	{
		for(int j=0;j<cellcount;j++)
		{
			String value = wb.getSheet("LoginPage").getRow(i).getCell(j).toString();
			System.out.print(value+"  ");
		}
		System.out.print("\n");
	}
	
	}
}
