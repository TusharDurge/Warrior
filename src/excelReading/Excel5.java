package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 File myFile = new File ("C:\\Users\\tushar\\Desktop\\velocity\\TUSHAR.xlsx");
		    
			Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
			
			//outer for loop for rows
			
			for(int i=0; i<=1;i++)
			{
				for(int j=0; j<=5;j++)
				{
				  CellType type = mysheet.getRow(i).getCell(j).getCellType();

				 if(type==CellType.STRING)
				{
					
				 String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(value+" ");		 
				}
				 else if (type==CellType.NUMERIC)
				 { 
					 double value = mysheet.getRow(i).getCell(j).getNumericCellValue();
					 System.out.print(value+" ");
					
				 }
				 else if (type==CellType.BOOLEAN)
					 
				 {
					  boolean value = mysheet.getRow(i).getCell(j).getBooleanCellValue();
					 System.out.print(value+" ");
				 }
					
				}
				System.out.println();
			}
		   	

	}

}
