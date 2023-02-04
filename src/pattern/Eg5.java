package pattern;

public class Eg5 {

	public static void main(String[] args) 
	{
	//	*****
	//	 ****
	//	  ***
	//	   **
	//	    *
        int star=5;
        int space=0;
		
		for(int row=1;row<=5;row++)
		{   
			for(int i=1;i<=space;i++)
			{
			 System.out.print(" ");	
			}
			for(int col=1;col<=star;col++)
			{	
			System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}
