package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		 File myFile = new File ("C:\\Users\\tushar\\Desktop\\velocity\\TUSHAR.xlsx");
		    
			Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
			
            int lastRowNo = mysheet.getLastRowNum();
            System.out.println(lastRowNo);
            
           short lastCellNo = mysheet.getRow(0).getLastCellNum();
           
           System.out.println(lastCellNo);
           
           int totalNoOfCells = lastCellNo-1;
           
           System.out.println(totalNoOfCells);
           
           for(int row=0; row<=lastRowNo;row++)
           { 
        	   for(int cell=0; cell<=totalNoOfCells; cell++)
        	   {
        		    Cell celltype = mysheet.getRow(row).getCell(cell);
        		    CellType type = celltype.getCellType();
        		   if(type==CellType.STRING)
        		   {
        			   System.out.print(celltype.getStringCellValue()+"   ");
        		   }
        		   
        		   if(type==CellType.NUMERIC)
        		   {
        			   System.out.print(celltype.getNumericCellValue()+"   ");
        		   }
        		    if(type==CellType.BOOLEAN)
        		   {
        			   System.out.print(celltype.getBooleanCellValue()+"   ");
        		   }
        		   
        	   }
        	  System.out.println(); 
           }
           
	}

}
