package Method_study;

public class Static_InSameclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syntax methodname();
		sample(); //here call the reular method in same class
		test();
		static_call_anotherclass.Mymethod();//call from another class i.e static_call_anotherclass.java

	}
	public static void sample() //regular static method
	{
		System.out.println("hi this regular static method");
	}
	public static void test() //regular static method
	{
		
	System.out.println("the static method");
		
	}

}
