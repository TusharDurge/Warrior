package logical;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
//		int a=10;
//		int b=2;
//		
//		int mul=a*b;
//		
//		System.out.println(mul);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st number");
		 int a = sc.nextInt();
		System.out.println("enter 2nd number");
	    int b = sc.nextInt();
		int mul=a*b;
		System.out.println("my multiplication is "+mul);
	System.out.println("================================");	
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("My name is "+name);

	}

}
