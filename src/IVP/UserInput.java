package IVP;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		//user Input 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value from user");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum= a+b;
		System.out.println("Sum of Two numbers is :"+ sum);
	}

}
