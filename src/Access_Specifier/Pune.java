package Access_Specifier;

public class Pune {

	public static void main(String[] args) {

		velocity v= new velocity();
		//v.test1(); // we can not call private method in anotherclass  bcz its call within call
		 v.test2();///calling default method visible within package

		 v.test3();//calling protected method visible within package...(use inheritance call outside package)
		 v.test4();
	}

}
