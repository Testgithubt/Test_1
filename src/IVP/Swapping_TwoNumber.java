package IVP;

import java.util.Scanner;

public class Swapping_TwoNumber {

	public static void main(String[] args) {
    //13. Swap two numbers with out using third variable
		int a,b;
		System.out.println("Enter Two Numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();   //eg 100 input value store
		b=sc.nextInt();  //200
		System.out.println("Before Swapping" + a+" "+b);
		a=a+b;   //a=100+200=300, a=300
		b=a-b;   //b=300-200=100, b=100
		a=a-b;   //a=300-100=200, a=100
		
		System.out.println("After Swapping "+a+" "+b);

		
	
	}

}
