package Parameter;

public class Mathopertion_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathopertion_Parameter MP=new Mathopertion_Parameter();
		MP.ADD(25, 20);
		MP.Sub(30, 25);
		MP.Multi(25, 5);
		MP.Div(25, 5);

	}
	
	public void ADD(int a,int b)
	{
	      System.out.println("******* Addition is ******");

		System.out.println( a+b);
	}
	public void Sub(int a,int b)
	{
      System.out.println("******* Subtraction is ******");
		System.out.println(a-b);
	}
	public void Multi(int c, int d)
	{
	      System.out.println("******* Multiplication is ******");
	      System.out.println(c*d);

	}
	public void Div(int a,int b)

	{
	      System.out.println("******* Division  is ******");
	      System.out.println(a/b);

	}
}
