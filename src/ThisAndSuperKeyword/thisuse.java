package ThisAndSuperKeyword;

public class thisuse {
	int a=10;// global variable
	String name="Yogesh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisuse T=new thisuse();
		T.test();

	}
	public void test()
	{
		int a=20; //local variable
		String name="Devyani";
		System.out.println("Local variable a is :"+a);
		System.out.println("Local variable name is :"+name);
		// i want print to global value using this keyword
		System.out.println("global value a is :"+this.a);
		System.out.println("global value string is :"+this.name);
		
		int add=100+a; //a is local variable
		System.out.println("Local value of add is :"+add);
		
		int add1=50+this.a; //a is global  variable
		System.out.println("Global value a is  :"+add1);
	}
			

}
