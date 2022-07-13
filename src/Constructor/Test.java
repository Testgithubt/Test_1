package Constructor;

public class Test {
	
	int a;
	int b;
	String name;
	public Test()
	{
		a=10;
		b=20;
		name="yogesh";
	}
	public Test(int x, int y)
	{
		a=x;
		b=y;
	}
	
	
	public void add()
	{
		int c=a+b;
		System.out.println("My Name is :"+name);
		System.out.println("add is "+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test T=new Test();
		T.add();
		Test T1=new Test(20, 30);
		T1.add();
		Test2 T2=new Test2("Prashant", 2.5f, 1);
		T2.Emp();

	}

}
