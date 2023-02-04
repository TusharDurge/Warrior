package collectionStudy;

import java.util.ArrayList;

public class CollectionArray {

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("Tushar");
		a.add('T');
		a.add(123.2f);
		a.add(null);
		a.add(true);
		
		System.out.println(a);
		System.out.println("============");
		
	ArrayList<String> a1 = new ArrayList<>();
	
	System.out.println(a1.add("Ujwala"));
	a1.add("Tushar");
	a1.add("Dighole");
	a1.add("Buldhana");
	a1.add(3, "Durge");
	
	System.out.println(a1);
	System.out.println("=======");
    
	//a1.clear();
	System.out.println(a1);
	System.out.println("=======");
	
    Object a2 = a1.clone();
    
    System.out.println(a1);
    System.out.println(a2);
	System.out.println("=======");
	
	System.out.println(a1.contains("gm"));
	System.out.println(a1.contains("Tushar"));
	System.out.println("=======");
	
	String ele = a1.get(2);
	
	System.out.println(ele);
	
	       
	
	
	
		
		
	}

}
