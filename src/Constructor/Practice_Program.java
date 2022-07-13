package Constructor;


public class Practice_Program {

	int a; int b; int sum;
	 public Practice_Program() {
		// TODO Auto-generated constructor stub
		 a=200;
		 b=100;
		 
		 
	}
	 public void display()
	 {
		 sum=a+b;
		 System.out.println("The sum is  :"+sum);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_Program PP=new Practice_Program();
		PP.display();

	}

}
