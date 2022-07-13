package StringClass_Study;

public class String_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to use length method()
		String name="Yogesh"; 
		System.out.println("length of name is "+name.length());
		System.out.println("************");
		
		String name1= "velocity"; // without using new keyword store in constant pool area
		System.out.println(name1.length());
		 int output =name1.length();
		 System.out.println("length string is :"+output);
		 System.out.println("***************");
		
       String city=new String("Pune");//with using new keyword store in non constant pool area
		System.out.println(city.length());
		int p=city.length();
		System.out.println("City length is :"+p);

	}

}
