package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile = new File ("E:\\selenium\\TUSHAR.xlsx");
	    
		Object value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				
				System.out.println("Value is "+value);
	}

}
