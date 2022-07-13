package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashsetStudy {

	public static void main(String[] args) {

		HashSet<Object> hs=new HashSet<>();
		hs.add("Yogesh");
		hs.add(123);
		hs.add("Yogesh");
		hs.add(null);
		hs.add('A');
		System.out.println(hs);
		System.out.println("******************");
		//methods
		System.out.println(hs.size());
		System.out.println(hs.contains('A'));
		System.out.println(hs.isEmpty());
		System.out.println(hs.toString());
		//System.out.println(hs.remove(null));
		System.out.println("*****************");
		
		//for each
		
		for(Object H:hs)
		{
			System.out.println(H);

		}
		System.out.println("*****************");

		
		  Iterator<Object> It = hs.iterator();
		  while(It.hasNext())
		  {
			  System.out.println(It.next());
		  }
			System.out.println("*****************");

		  //specific arraylist
		  LinkedList<Integer> LL=new LinkedList<>();
		  LL.add(10);
		  LL.add(50);
		  LL.add(40);
		  LL.add(90);
		  LL.add(100);
		  System.out.println(LL);
		System.out.println("*****************");
		LinkedList<String> SS=new LinkedList<>();
		SS.add("Yogesh");
		SS.add("Abhi");
		SS.add("Ganesh");
		SS.add("Mahesh");
		System.out.println(SS);
		

		  
		  
		  }
			
	}


