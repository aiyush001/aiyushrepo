package com.actitime.generics;
//FRAMEWORK
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * Generic class for data driven testing
 * @author AIYUSH
 *
 */



public class FileLib 
{
	
	/**
	 * generic method to read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	
	public String getPropertyValue(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./Data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
	
	
	/**
	 * generic method to read data from excel file
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	
	public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("./Data/testscript.xlsx");
	     Workbook wb=WorkbookFactory.create(fis);
	     String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	     return data;
	}
	
	/**
	 * generic method to write data back to excel
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	
	public void writeExcelData(String sheet,int row, int cell,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("./Data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./Data/testscript.xlsx");
		wb.write(fos);
		wb.close();
	}

}
