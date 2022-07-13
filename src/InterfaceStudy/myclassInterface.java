package InterfaceStudy;

public class myclassInterface implements MyInterface {
	
	//here implments myinterface class and override method with the help  click on unimplented option.

	public static void main(String[] args) {

		myclassInterface M=new myclassInterface(); //create obj of implemation class
		M.test();
		M.test1();
		//a=a+10;  a is final we cant update value of a
	}

	@Override
	public void test() {

		int x=5;
		int y=7;
		int mul=x*y;
		System.out.println("mul is :"+mul);
		System.out.println("test method completed  in implementation class");
		System.out.println("************");
	}

	@Override
	public void test1() {
		int a=25;
		int b=5;
		int div=a/b;
		System.out.println("div is :"+div);
		System.out.println("test1 method completed  in implementation class");

		System.out.println("*******");
		
	}

}
