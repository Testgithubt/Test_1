package IVP;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {

		//CompareArrays and return true or false
		
		int arr1[]= {10,20,30};
		int arr2[]= {30,40,50};
		int arr3[]= {10,20,30};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		System.out.println(Arrays.equals(arr3, arr2));

		
		
	}

}
