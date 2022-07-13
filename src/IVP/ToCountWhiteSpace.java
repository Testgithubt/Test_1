package IVP;

import java.util.Scanner;

public class ToCountWhiteSpace {

	public static void main(String[] args) {
// count the white space between String 
	/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.next(); */
		
		String str= "P U N  E";
		int count=0;  //initially ur count is 0
		for(int i=0;i<=str.length()-1;i++)
		{
			char mychar = str.charAt(i);
			if(mychar==' ')
			{
				count ++;
			}

		}			
		System.out.println("number of WhiteSpace is "+ count);

		
		
	}

}
