package IVP;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Given no is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
	}

}
