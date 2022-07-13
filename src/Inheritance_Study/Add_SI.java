package Inheritance_Study;

public class Add_SI {
	int a;
	int b;
	
	public void Addition()
	{
		a=10; b=20;
		int sum=a+b;
	System.out.println(sum);
	}
		
	}
class Sub_SI extends Add_SI{
  
	public void sub()
	{
		a=60; b=40;
		int subs=a-b;
		System.out.println(subs);
	}
  }
  
  class Operation{
	  
  public static void main(String[] args) {

	Add_SI s=new Add_SI();
	s.Addition();
	
Sub_SI s1=new Sub_SI();
s1.sub();
s1.Addition();
}
  }


