package IVP;

import java.util.Scanner;

public class Reverse_Number_By_Convert {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Number");
		int num = sc.nextInt();
		//int num=123;
		int revnum=0;
		for( int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revnum=revnum*10+rem;
			
		}
		System.out.println("Reverse number is :"+revnum);

	}

}
