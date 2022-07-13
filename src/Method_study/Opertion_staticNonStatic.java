package Method_study;

public class Opertion_staticNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//Create Object of Same class
		Opertion_staticNonStatic OS=new Opertion_staticNonStatic();
		
		//Call Method in same class
		OS.Addition();
		
		//Calling Static method in same class
		Sub();
		
		//calling nonstatic method from another class so we create object first
		Test_Operation T=new Test_Operation();
		
		//calling nonstatic multi method
		T.Multi();
		
		//calling static method from another class-->classname.methodname
		Test_Operation.Division();

	}

	
	//Non Static Regular method
	public void Addition()
	{
		int a=30;
		int b=10;
		int sum=a+b;
		System.out.println("The sum is  :"+sum);
	}
	//Regular static method
	public static void Sub()
	{
		int a=50;
		int b=20;
		int sub1=a-b;
		System.out.println("The Sub is :"+sub1);
		
	}
}
