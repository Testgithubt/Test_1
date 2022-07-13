package IVP;

public class Fibonacci_Series {

	public static void main(String[] args) {

		//Fibonacci_Series means first two number 0 and 1
		// it means sum of first  two number
		//series like 0+1=1,1+1=2;2+1=3; 3+2=5,
		//1,2,3,5,8,13  
		
		int a=0;
		int b=1;
		for(int i=1; i<=10 ;i++)
		{
			int c;
			c= a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}

}
