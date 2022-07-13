package IVP;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Number");
		int num = sc.nextInt();
		
		int num1=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			
			num1=num1+(rem*rem*rem);
		}
		System.out.println(num1);
		if(num==num1)
		{
		System.out.println("Given No.is Amstrong number" +num);
		}
		else
		{
			System.out.println("Given no is not Prime number" +num);
		}
		
	
	}

}
