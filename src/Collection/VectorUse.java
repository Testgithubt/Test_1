package Collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse {

	public static void main(String[] args) {

		//Generic Arraylist 
		Vector V= new Vector();
		V.add("Yogesh");
		V.add("Pune");
		V.add('A');
		V.add(123);
		V.add(null);
		System.out.println(V);
		System.out.println(V.get(1));
		System.out.println(V.isEmpty());
		System.out.println(V.remove(1));
		
		
		System.out.println(V);
		
		// Using Specific Arraylist
		System.out.println("**************");
		Vector<Character> Vi=new Vector<>();
		Vi.add('A');
		Vi.add('B');
		Vi.add('C');
		System.out.println(Vi);
		System.out.println("**************");

		
		//ListIterator
		
		ListIterator LIT = V.listIterator();
		while(LIT.hasNext())
		{
			System.out.println(LIT.next());
		}
		System.out.println("**************");


		
		
	//Enumeration
		
		 Enumeration VE = V.elements();
		 while(VE.hasMoreElements())
		 {
			 System.out.println(VE.nextElement());
		 }
			System.out.println("**************");
			
	
	//For Each
			
			for( Object E:V)
			{
				System.out.println(E);
				
			}	
		
	}

}
