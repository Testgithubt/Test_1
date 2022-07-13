package Variable_Types;

public class math_Operation {
	int a=50; //global variable
	static int b=100; //static global variable
	

	public static void main(String[] args) {
		
		int c=30; //local variable
		int add=c+math_Operation.b; //local variable +classname.static variablename
		System.out.println("Add is : "+add);  
		
		math_Operation Mo=new math_Operation();
		
		int sub =b-Mo.a; //static varible-objectname.global variablename
		System.out.println("Sub is  :"+sub);;
		
		int mul=c*Mo.a; //local variable*objectname.global vname
		System.out.println("The mul is :"+mul);
		
		int div =b/(Mo.a); //static global*gobal varible
		System.out.println("Div is  :"+div);
		
	}

}
