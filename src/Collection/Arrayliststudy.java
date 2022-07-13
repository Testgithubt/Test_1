package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrayliststudy {

	public static void main(String[] args) {
		
		ArrayList<Object> a=new ArrayList<>();
		
		a.add("Yogesh");
		a.add('A');
		a.add(123);
		a.add(true);
		a.add(null);
		a.add("Yogesh");
		a.add(123);
		a.add('A');
		System.out.println(a); //array list display
		System.out.println("************");
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(123));
		System.out.println(a.indexOf(123));
		System.out.println(a.get(1));
		System.out.println(a.remove(2));
		System.out.println("******************");
		
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i)); //individual element print
		}
		System.out.println("*****************");
		
		// Using Iterator operator
		
		  Iterator<Object> IT = a.iterator();
		 // System.out.println(IT.hasNext());
		  while(IT.hasNext())
		  {
			  System.out.println(IT.next());
		  }
			System.out.println("*****************");

		  //ListIterator 
		  
		   ListIterator<Object> LTR = a.listIterator();
		   while(LTR.hasNext())
		   {
			   System.out.println(LTR.next());
		   }
			System.out.println("*****************");

		   
		   //For Each
		   for ( Object v:a)
		   {
			   System.out.println(v);
		   }
			System.out.println("*****************");

		   
		   //For Specific Element
		   
		   ArrayList<Integer> ai=new ArrayList<>();
		   
		     ai.add(123);
		     ai.add(12);
		     a.add(45612);
			System.out.println("*****************");

		     System.out.println(ai);

		     for( Integer S:ai)
		     {
		    	 System.out.println(S);
		     }
		
		
		

	}

}
