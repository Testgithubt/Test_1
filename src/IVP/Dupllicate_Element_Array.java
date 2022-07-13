package IVP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dupllicate_Element_Array {

	public static void main(String[] args) {
		
		//Duplicate elements in an array
		
		String Arr[]= {"Yogesh","Ram","Ganesh","Yogesh","Ram"};
		
		for(int i=0;i<Arr.length;i++)  // outer for 1
		{
			
			for(int j=i+1;j<Arr.length;j++)
			{
				if(Arr[i]==Arr[j]) {
            System.out.println("Duplicate Element is :"+Arr[i]);
					
				}
				
			
		}
		}
	}
}

	
		
		/*System.out.println("****************");
		//Hashset
		
		HashSet<Integer> Int=new HashSet<>();
		Int.add(20);
		Int.add(10);
		Int.add(20);
		Int.add(30);
		System.out.println(Int);
		System.out.println("****************");

		
		String Arr1[]= {"Yogesh","Ram ", "Yogesh","Ganesh","Yogesh"};
		HashSet<String> Str=new HashSet<>();
		
		for(  String L:Arr1)
		{
			System.out.println(Str.add(L)); //if duplicate then return false
		}
		*/
		

		
	