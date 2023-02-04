package pattern;

public class Eg8 {

	public static void main(String[] args) 
	{

		   // *
		  // ***
	     // *****
		 //*******
		
		int star=1;
		int space=3;
		
		for(int row=1;row<=4;row++)
		{
			for(int i=0;i<=space;i++)
			{
				System.out.print(" ");
			}
			
			for(int col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
			
		}

	}

}
