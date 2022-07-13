package AbstractClass;

public class concreteAb extends staticAb{

	public static void main(String[] args) {

		concreteAb c=new concreteAb();
	     c.demo1();
		demo3();
		concreteAb.demo();
		
		}
			@Override
			public void demo1() 
			{
     System.out.println("hi i am incomplete method of staticAb");				
			}
			

  public static void demo3()
			
	{
		System.out.println("Hi I am static method of demo3");
	

}
}
