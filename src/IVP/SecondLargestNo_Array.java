package IVP;

import java.util.Arrays;

public class SecondLargestNo_Array {

	public static void main(String[] args) {
		// Find second Largest number  in array
		
		int arr[]= {1,4,3,8,6,9};
		
		int num=arr.length; //create a variable of object by using length
		
				Arrays.sort(arr); //direct by .sort method

		
				System.out.println("Second largest no "+arr[num-2]);
		

	}

}
