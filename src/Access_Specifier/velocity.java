package Access_Specifier;

public class velocity {
	
	
	public static void main(String[] args) {
		
		velocity v=new velocity();
		v.test1(); //calling private method visible within class
		v.test2();//calling default method visible within package
		v.test3();//calling protected method visible within package...(use inheritance call outside package)
		v.test4();//calling public method visible throuhout project
	}	
	
	private void test1()
	{
		System.out.println("This is test1 private method ");
	}
	void test2()
	{
		System.out.println("This is default method");
	}
	protected void test3()
	{
		System.out.println("This is protected method");
	}

	public void test4()
	{
		System.out.println("Public method");
	}
		

}
