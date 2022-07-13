package IVP;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// 4!=4*3*2*1=24
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Factorial Number");
		int num = sc.nextInt();
		int num1=1;
		for(int i=num;i>=1;i--)
		{
			num1=num1*i; //eg:6*1=6,6*5=30, 4*30=120,3*120
			
		}
		System.out.println("Factorial Number is :"+num1);

	}

}
