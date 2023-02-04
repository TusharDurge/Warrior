package pattern;

public class Eg13 {

	public static void main(String[] args) 
	{    //*         *
		 //**       **
		 //***     ***
		 //****   ****
		 //***** *****
		 //****   ****
		 //***     ***
		 //**       **
         //*         *
		
		// ( Remember : Star Space Space Star)
		
		int star1=1;
		int space1=5;
		int star2=1;
		int space2=4;
		
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=star1;col++)
			{
				//System.out.print("*");
				System.out.print(col);
			}
			
			for(int i=1;i<=space1;i++)
			{
				System.out.print(" ");
			}
			for(int i1=1;i1<=space2;i1++)
			{
				System.out.print(" ");
			}
			for(int col1=1;col1<=star2;col1++)
			{
			   //System.out.print("*");
			   System.out.print(col1);
			}
		
			if(row<5)
			{
				star1++;
				space1--;
				space2--;
				star2++;
			}
			
			else
			{
				star1--;
				space1++;
				space2++;
				star2--;
			}
			System.out.println();
		}   
	}

}
