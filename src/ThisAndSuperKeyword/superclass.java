package ThisAndSuperKeyword;

public class superclass  extends superuse{
	int p=100;// global variable from super class
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superclass s=new superclass();
		s.test();

	}
	public void test()
	{
		int p=10; // local variable
		System.out.println("Local value of p is "+p);
		System.out.println("Global value of p is "+this.p);
		
		System.out.println("Global value of p from super use class  p is "+super.p);
		
		
	}

}
