package Constructor;

public class percentage {
	
	float eng; float mar;
	float testing; float automation;
	
	public percentage() {
		// TODO Auto-generated constructor stub
		eng=50;
		mar=60;
		testing=80;
		automation=80;
	}
	
	public void display()
	{
		float per =(eng+mar+testing+automation)/400*100;
		System.out.println("Percentage is :"+per);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		percentage P=new percentage();
		P.display();

	}

}
