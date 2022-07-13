package Method_study;

public class NonStatic_SameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To call Non Static Regular method we need object of class
		//Syntax: ClassName ojectname=new classname();
		
		NonStatic_SameClass Ns= new NonStatic_SameClass(); //create object of class
		 
		//Call Non Static Method in Same class
		//syntax--->objectname.methodname();
		Ns.Mymethod()
		;
		
		
		/*created object  another class we need to create object of that class means we create
		 * NonStatic_anotherclass create object 
		 */
		NonStatic_anotherclass NA= new NonStatic_anotherclass();
		
		//to call method from NonStatic_anothercall means we call display mehod
		//syntax object.method();
		  NA.display();
		
		

	}
	
	//Non Static Regular Method
	public void Mymethod()
	{
		System.out.println("hi I am Non Static regular method in same class");
	}

}
