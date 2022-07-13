package Variable_Types;

public class square_variable {

	int a=25;
	static int b=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square_variable sv=new square_variable();
		sv.square();
		System.out.println("********");
		//square_variable.Even();
		Even();
	}

public void square()
{
	int num=a*a; //square
	System.out.println( "Square is :"+num);
	
	int num1=b*b*b;//cube
	System.out.println("Cube is :" +num1);
}
public static void Even()
{
	for(int i=0;i<10;i++)
	{
	System.out.println("Even Num :"+2*i);
}
}
}
