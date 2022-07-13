package IVP;

import java.util.Arrays;

import String.Reverse;

public class reverseWithoutForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {1,2,1,5,4,5,3,6,3,};	
          countduplicate(arr);
      
 
	  	}

	private static void countduplicate(int[] arr) {

		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				else
				{
					break;
				}
				if(count>1)
				{
					System.out.println(arr[i] + " " + count);

				}
			}
		}
	}

}
