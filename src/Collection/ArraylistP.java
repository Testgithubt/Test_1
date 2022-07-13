package Collection;

import java.util.ArrayList;

public class ArraylistP {

	public static void main(String[] args) {
		
		ArrayList<Object> L=new ArrayList<>();
		L.add("Yogesh");
		L.add('A');
		L.add(23);
		L.add(null);
		System.out.println(L);
		System.out.println("*********");
		
		for(int i=0;i<=L.size()-1;i++)
		{
			System.out.println(L.get(i));
		}

	}

}
