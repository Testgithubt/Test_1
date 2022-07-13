package Method_study;

public class Practice_Method {

	public static void main(String[] args) {
		Add();
		Practice_Method PM=new Practice_Method();
		PM.sub();
		
       Practice_another.mul();
       
       Practice_another PA=new Practice_another();
       
       PA.div();
	}
	
	
 public static void Add()
 {
	 int a=10;
	 int b=20;
	 int c=a+b;
	 System.out.println("Add is :"+c);
 }

 public void sub()
 {
	 int a=20;
	 int b=30;
	int  c=b-a;
	System.out.println("sub is :"+c);
 }
}
