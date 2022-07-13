package Saample;



import Access_Specifier.velocity;

public class Access_Test extends velocity {

	public static void main(String[] args) {

		velocity v=new velocity();
		//v.test1(); //calling private method visible within class
		//v.test2();//calling default method visible within package
		//v.test3();//calling protected method visible within package...(use inheritance call outside package)
		v.test4();//calling public method visible throuhout project
		Access_Test T=new Access_Test();
		T.test3();// protected method call outside the package  using inheritance extends 
		T.test4();
		}

}
