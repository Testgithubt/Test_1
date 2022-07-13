package Variable_Types;

public class Add {
	
	 int a=50; //global variable
	 static int b=30; //static global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add  A=new Add();
			A.mul();
	  int sub =A.a-Add.b;
		System.out.println("the value of sum is :"+ sub);
		System.out.println("the value of a iS:"+A.a);
		System.out.println("the Value of b is :"+b);
		
		int div=A.a/Add.b;
		System.out.println("Div is "+div);;
	}

	public void mul()
	{
		int p=20;
		int q=10;
		int mul=p*q;
		System.out.println("the mul is "+mul);;
	}
}
