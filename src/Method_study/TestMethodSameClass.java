package Method_study;

public class TestMethodSameClass {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square();
		TestMethodAnother TM=new TestMethodAnother();
		TM.Square1();
	}
	
	public static void square()
	{
		
		int num=10;
		
		int square=num*num;
		System.out.println("The square is :"+square);
		
	}


}
