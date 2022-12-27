package dataDrivenData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataBackToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wbs = WorkbookFactory.create(fis);
           wbs.getSheet("LoginPage").getRow(2).getCell(3).setCellValue("pass");
           FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");//converts java file object data into physical file(external resource file)
           wbs.write(fos);//save the workbook(actual writing happens here)
           wbs.close();//close the workbook
           
	}

}
