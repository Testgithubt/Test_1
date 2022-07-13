package Array_Study;

import java.util.Arrays;

public class Array_Method {

	public static void main(String[] args) {

		//sort()-->this is static method
		int rollNum[]= {6,4,3,2,1,5};
		//we need for sorting rollnum  in squence to  use sort method
		Arrays.sort(rollNum);
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("***********");
		
		//reverse order
		for(int i=rollNum.length-1;i>=0;i--)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("***************88");
		
		//Split()-->
		String S="velocity cooperate  training center";
		
		String[] Output=S.split(" ");
		for(int i=0;i<=Output.length-1;i++)
		{
			System.out.println(Output[i]);
		}
	}

}
