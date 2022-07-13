package Constructor;

//class declare
public class StudentInfo {  
	//Variable declare
	
	int rollNum; String Name;  String Class ; char grade;
	
//Constructor declare with Parameter
	StudentInfo(int number, String N,  String c , char g)

{

	//vaiarble iniltization to the parameter
		
		rollNum=number;
		Name=N;
		Class=c;
		grade=g;


}
	//call main method
	 public static void main(String [] agrs) 
	 {
		 StudentInfo SI=new StudentInfo(10, "Yogesh", "MCA", 'A');
		 SI.Display();
		 System.out.println("***********************");

          SI.Display();
		 
		 
	 }
	 //declare non static regular method
	 public void Display()
	 
	 {
		 System.out.println("Student Roll NO. is :"+rollNum);
			System.out.println("Student Name  is :"+Name);
			System.out.println("Student  Class is :"+Class);
			System.out.println("Student Grade is :"+grade);

	 }
}
