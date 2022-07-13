package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Object> T=new TreeSet<>();
		T.add(90);
		//here u can declare one type data, if u enter differrent type data then u get classcastexception occur
	//	T.add("Abhi");
		T.add(20);
		T.add(50);
		T.add(40);
		T.add(100);
		//T.add(null); here occur nullpointerException
		System.out.println(T);
		System.out.println("*************");
		
		//method
		System.out.println(T.size());
		System.out.println(T.isEmpty());
		System.out.println(T.contains(20));
		System.out.println("*********************");
		
		//foreach
		for( Object T1:T)
		{
			System.out.println(T1);
		}
		System.out.println("*********************");

		
		//itreator
		
	 Iterator<Object> Ltr = T.iterator();
		while(Ltr.hasNext())
		  {
		     System.out.println(Ltr.next());
		     }
		
		TreeSet<String> TS=new TreeSet<>();
		TS.add("Yogesh");
		TS.add("Abhi");
		TS.add("Devansh");
		TS.add("Mahesh");
		System.out.println(TS);
	}

}
