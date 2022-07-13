package Polymorphism;

public class CompileTime {

	public static void main(String[] args) {
		
CompileTime T=new CompileTime();
T.add();
T.add(20,30);
T.add(25, 30, 50);
T.add(23.5f, 32.0f);
		
	}
	public void add() 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void add(int a, int b, int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
	public void add(float a,float b)
	{
		float sum=a+b;
		System.out.println(sum);
	}


}

