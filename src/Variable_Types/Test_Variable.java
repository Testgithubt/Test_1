package Variable_Types;

public class Test_Variable {
	
	int a=20; //global variable
	static int b=10; //static global varible

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test_Variable TV=new Test_Variable();
		 TV.add();

	}

	public void add()
	{
		int x=12;
		int y=8;
		int sum=x+y;
		System.out.println("Sum is  :"+sum);
		
	}
}
