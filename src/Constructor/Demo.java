package Constructor;

public class Demo {
	int a; //intilize variable
	int b; //initlize variable
	
	 public Demo() // user define constructor
	{
		//initlalize data member/variable
		a=100;
		b=200;
	}

public static void main(String [] agrs) 
 {
	 Demo D=new Demo();
	 D.add();
	 D.sub();
 }
 
 public void add() //non static regular method
 {
	 int sum=a+b;//value of a &b received from constructor
	 
	 System.out.println("the sum is :"+sum);
 }

 public void sub()// non static regular method
 {
	 int sub=a-b;
	 System.out.println("The sub is :"+sub);
 }
}

