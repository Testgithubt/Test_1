package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedsetstudy {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> LS=new LinkedHashSet<>();
		LS.add('A');
		LS.add("Yogesh");
		LS.add(123);
		LS.add(null);
		LS.add("Yogesh");
		LS.add(12.23);
		System.out.println(LS);
		System.out.println("*******************");
		//method
		System.out.println(LS.size());
		System.out.println(LS.isEmpty());
		System.out.println(LS.contains('A'));
		System.out.println("*******************");
		//foreach
		
		for(Object L:LS)
		{
			System.out.println(L);
		}
		System.out.println("*******************");

		//itertor
		  Iterator<Object> Ltr = LS.iterator();
		  while(Ltr.hasNext())
		  {
			  System.out.println(Ltr.next());
		  }
			System.out.println("*******************");
			
		//Specifcarraylist
			
			
			LinkedList<Integer> LI=new LinkedList<>();
			LI.add(30);
			LI.add(20);
			LI.add(50);
			LI.add(90);
			System.out.println(LI);

	}

}
