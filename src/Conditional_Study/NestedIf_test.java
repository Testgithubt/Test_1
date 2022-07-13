package Conditional_Study;

public class NestedIf_test {

	public static void main(String[] args) {
		// if num/2-->it is even number
		//if num!==2-->it is odd
		//else not even or odd
		int num=16;
		
		if(num%2==0)
		{
			System.out.println("Number is even");
			if(num==2)
			{
				System.out.println("Number equals to 2");
			}
		}
		
		else {
			System.out.println("Number is odd");
		}

	}

}
