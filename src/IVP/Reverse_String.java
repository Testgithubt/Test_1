package IVP;

import java.util.Scanner;

public class Reverse_String {

	
	public static void main(String[] args) {
    //Reverse String 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String a=sc.next();
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Original String is :"+a);
		System.out.println("Reverse String is  :"+b);
	}

}
