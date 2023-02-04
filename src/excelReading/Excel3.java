package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

        File myFile = new File ("C:\\Users\\tushar\\Desktop\\velocity\\TUSHAR.xlsx");
	    
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		//Reading whole row deta
		//cell is varing and row is constant
		
		for (int i=0; i<=4; i++)
		
		{String value1 = mysheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value1);
		}
		System.out.println("=======");
		
		//Reading whole cell deta
		for (int i=1; i<=4; i++)
		{
			String value2 = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value2);
		}
		
		
	}

}
