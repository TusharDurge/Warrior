package logical;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args)
	{
		// evenNum/2-->remainder-->0
		// System.out.println(10/2);
		//System.out.println(10%3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		
		int no = sc.nextInt();
		
	    if(no%2==0)
	    {
	    	System.out.println("entered number is even");
	    }
	    else
	    {
	    	System.out.println("entered no is odd");
	    }
	}

}
