package logical;

import java.util.Scanner;

public class CountNumberOfBlankSpaces {

	public static void main(String[] args) 
	{
//        String s="Tushar   ";
//        int count =0;
//        
//        for(int i=0;i<=s.length()-1;i++)
//        {
//        	char t = s.charAt(i);
//        	if(t==' ')
//        	{
//        	  count++;	
//        	}
//        }
//        System.out.println("Number of blank spaces are "+count);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any name");
		String name = sc.next();
		int count =' ';
		
		for(int i=0; i<=name.length()-1;i++)
		{
			if(count==' ')
			{
				count++;
			}
		}
		System.out.println("Number of blank spaces are "+count);
		
	}

}
