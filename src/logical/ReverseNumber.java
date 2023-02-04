package logical;

public class ReverseNumber {

	public static void main(String[] args)
	{
		int orgNum=1234;
		String orgStr = Integer.toString(orgNum);
		String revStr = "";
        
		for(int i=orgStr.length()-1;i>=0;i--)
		{
			char t = orgStr.charAt(i);
			revStr=revStr+t;
		}
		
		int revNum = Integer.parseInt(revStr);
		System.out.println("Original number is "+orgNum);
		System.out.println("Revser number is "+revNum);
	}

}
