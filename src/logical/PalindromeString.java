package logical;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String orgstr = sc.next();
		String revstr ="";
		
		for(int i=orgstr.length()-1; i>=0;i--)
		{
			char t = orgstr.charAt(i);
			revstr=revstr+t;
		}
		System.out.println("original string is "+orgstr);
		System.out.println("reverse string is "+revstr);
		
		if(orgstr.equals(revstr))
		{
			System.out.println("String is palindrome");
		}
		else
		{
		    System.out.println("String is not palindrome");
		}
		

	}

}
