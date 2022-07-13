package Method_study;

public class NonStatic_TestSameclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we need first create object 
		//syntax--> classname objectname =new classname();
		
		NonStatic_TestSameclass NTS =new NonStatic_TestSameclass();
		
		//To call Non static method
		//syntax-->objectname.methodname();
		
		NTS.AddDiv();//call method name

	}
	
	//non static regular method in same class
	public void AddDiv()  //AddDiv method to call in main method
	{
		//Variable declare and Initlize
		 double a=2+6;
		 double b=a/4;
		 
		 int c=2+6;
		 int d=c/4;
		 
		 //Usags
		 System.out.println("The value of b :="+b);
		 System.out.println("The value of d :="+d);
		 
		
	}

}
