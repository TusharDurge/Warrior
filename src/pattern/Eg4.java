package pattern;

public class Eg4 {

	public static void main(String[] args) 
	{
		// *****
		// ****
		// ***
		// **
		// *
		
		int star=5;
		for(int row=1; row<=5; row++)
		{
			for(int col=1;col<=star;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
		}

	}

}
