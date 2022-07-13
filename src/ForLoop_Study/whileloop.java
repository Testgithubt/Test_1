package ForLoop_Study;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {

		int n;
		int a,b;
		System.out.println("Enter value");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		while(n<=70)
		{
			System.out.println(n);
			n=n+3;
		}
	}

}
