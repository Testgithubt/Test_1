package Interface;

public class Final_Keyword {
	int a=100;
	final int b=20;

	public static void main(String[] args) {

		Final_Keyword F= new Final_Keyword();
		F.add();
	}
	
	public void add()
	{
		a=a+10;
		System.out.println(a);
		//b=b+100;  we can t update value of final variable
		System.out.println( "Final of B is  :"+b);
	}

}
