package Constructor;

public class Practice_WithParameter {
	
	int a;
	int b;
	int c;
	 public Practice_WithParameter(int x, int y, int z)
	 {
		// TODO Auto-generated constructor stub
		 a=x;
		 b=y;
		 c=z;
	}
	 public void Inc()
	 {
		 a++;
		 b++;
		 c++;
		 System.out.println("value is  :"+a);
		 System.out.println("value is  :"+b);

		 System.out.println("value is  :"+c);

	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_WithParameter PP=new Practice_WithParameter(25, 26, 27);
		PP.Inc();
		System.out.println("********************");
		Practice_WithParameter p1=new Practice_WithParameter(30, 40, 50);
		p1.Inc();

	}

}
