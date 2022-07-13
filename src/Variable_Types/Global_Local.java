package Variable_Types;

public class Global_Local {
	
	int a=10; //global variable declare
	static int b=20; //static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=30; //local variable
		System.out.println("the value of local variable is :"+c);
		
		// if u call the static variable i.e classname.variable
		System.out.println("the value of static global variable is :"+Global_Local.b);
		
		//if u call global variable then u create object
		Global_Local GL=new Global_Local();
		System.out.println("The value of global variable is :"+ GL.a); //objectname.global variable name
	}

}
