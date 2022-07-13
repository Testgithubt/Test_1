package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList_Study {

	public static void main(String[] args) {

		//Generic ArrayList
		LinkedList<Object> L=new LinkedList<>();
		L.add("Yogesh");
		L.add(123);
		L.add('A');
		L.add(null);
		L.add(true);
		System.out.println(L);
		System.out.println("*************");
		System.out.println(L.get(2));
		System.out.println(L.isEmpty());
		System.out.println(L.size());
		System.out.println(L.indexOf('A'));
		System.out.println(L.remove(4));
		System.out.println("*************");
		
		// Using Specific Arraylist
		LinkedList<String> LS=new LinkedList<>();
		LS.add("Yogesh");
		LS.add("Prashant");
		LS.add("Nikhil");
		LS.add("Pune");
		System.out.println(LS);
		System.out.println("*************");

		
		//Iterator
		   Iterator<Object> LI = L.iterator();
		   while(LI.hasNext())
		   {
			   System.out.println(LI.next());
		   }
		 System.out.println("*************");

		
		//Using list Iterator
		 
		    ListIterator<Object> LTR = L.listIterator();
		    while(LTR.hasNext())
		    {
		    	System.out.println(LTR.next());
		    	
		    }
			System.out.println("*************");
			
		//For Each
			
			for( Object M:L)
			{
				System.out.println(M);
			}
			System.out.println("*************");
			
			
	




		
		
		
		

	}

}
