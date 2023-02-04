package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	
	{
        File myFile = new File ("C:\\Users\\tushar\\Desktop\\velocity\\TUSHAR.xlsx");
	    
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//string cell type 
		
		Cell mycell1 = mysheet.getRow(0).getCell(0);
		
		System.out.println(mycell1.getCellType());
		
		
		String cellvalue = mycell1.getStringCellValue();
		System.out.println(cellvalue);
		System.out.println("========");
		
		//boolean cell type 
	    Cell mycell2 = mysheet.getRow(0).getCell(1);
	    System.out.println(mycell2.getCellType());
	    
	    
	    boolean cellvalue2 = mycell2.getBooleanCellValue();
	    System.out.println(cellvalue2);
	    System.out.println("========");
	    
	  //boolean cell type 
	    
	    Cell mycell3 = mysheet.getRow(0).getCell(2);
	    System.out.println(mycell3.getCellType());
	    
	    double cellvalue3 = mycell3.getNumericCellValue();
	    
	    System.out.println(cellvalue3);
	   
	    
	    
	    
	    
	    
	 }

}
