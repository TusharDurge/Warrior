package pattern;

public class Eg12 {

	public static void main(String[] args)
	{
		 //*
		 //**
		 //***
		 //****
		 //***
		 //**
		 //*

		int star=1;
		
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			System.out.println();
          
			if(row<4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
		
	}

}
