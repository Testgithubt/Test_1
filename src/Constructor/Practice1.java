package Constructor;

public class Practice1 {

	int a; 
	int b; 
	int c;
	
	public Practice1()
	{
		a=5;
		b=6;
		c=7;
	}
	
	public void Increment()
	{
		a++;
		b++;
		c++;

		System.out.println("a value is :"+ a);
		System.out.println("a value is :"+ b);

		System.out.println("a value is :"+ c);

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice1 P1=new Practice1();
		P1.Increment();

	}
	

}
