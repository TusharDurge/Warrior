package pattern;

public class Eg3 {

	public static void main(String[] args) 
	{
		// *
		// **
		// ***
		// ****
		// *****
		
		int star=1;//2
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=star;col++)//2
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
		}
	}

}
