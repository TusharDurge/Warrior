package logical;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any no");
	  
	    int num = sc.nextInt();
        int fact = 1;
        
        for(int i=num;i>=1;i--)
        {
        	fact=fact*i;
        }
        
        System.out.println("factorial of "+num+" is "+fact);
	}

}
