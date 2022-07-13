package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List {

	public static void main(String[] args) {

		LinkedList<Object> LL=new LinkedList<>();
		LL.add("Yogesh");
		LL.add(123);
		LL.add("Yogesh");
		LL.add('A');
		LL.add(null);
		LL.add(true);
		LL.add(null);
		System.out.println(LL);
		System.out.println("===================");
		System.out.println(LL.size());
		System.out.println(LL.isEmpty());
		System.out.println(LL.getFirst());
		System.out.println(LL.getLast());
		System.out.println(LL.peek()); //reterive element but doesnot remove element
		System.out.println(LL.peekLast()); //retrive the last element
		
		System.out.println(LL.poll()); //retrive element and remove element
		System.out.println(LL);
		System.out.println(LL.pollLast()); //remove the last element
		System.out.println(LL);
		
		System.out.println(LL.pop()); //remove first element 
		System.out.println("================================");

		
		//System.out.println(LL.push("Pune")); //not use in generic arraylist
		
		//forloop
		 
		for(int i=0;i<=LL.size()-1;i++)
		{
			System.out.println(LL.get(i));
		}
		System.out.println("================================");

		//For Each
		
		for( Object M:LL)
		{
			System.out.println(M);
		}
		System.out.println("================================");
		
		//Iterator
		 Iterator<Object> LI = LL.iterator();
		 while(LI.hasNext())
		 {
			 System.out.println(LI.next());
		 }
			System.out.println("================================");
			
		//ListIterator
		ListIterator LLI=LL.listIterator();
		while(LLI.hasNext())
		{
		System.out.println(LLI.next());
			
		}
					


	}

}
