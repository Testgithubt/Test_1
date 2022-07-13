package Constructor;

public class Add_Sub {
	int a;
	int b;
	int sum,sub;
	
	Add_Sub(int x,int y)
	{
		a=x;
		b=y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_Sub AS=new Add_Sub(200, 100);
		AS.display();
		System.out.println("***********");
		Add_Sub as=new Add_Sub(300, 50);
		as.display();
		System.out.println("************");
		Add_Sub as1=new Add_Sub(450, 100);
		as1.display();

	}
 
	void display()
	{
		sum=a+b;
		System.out.println("the Sum is :"+sum);
		
		sub =a-b;
		System.out.println("the sub is :"+sub);
		
		
	}
}
