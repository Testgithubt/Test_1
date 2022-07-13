package Method_study;

public class Incement_Sameclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//u can call static method in same class then u call just 
		//methodname();
		Inc();
		// if u static in another class then u call
		//classname.methodname();
		
		Inc_StaticAnother.Dec(); //call from Inc_static another class

	}

	public static void Inc()
	{
		int a=10;
		int b=20;
		a++;
		b++;
		System.out.println(" The a value is  :"+a);
		System.out.println("The b value is :"+b);
	}
}
