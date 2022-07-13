package Parameter;

public class EmpNonStaticP {

	public static void main(String[] args) {
		// create object
		EmpNonStaticP ESP=new EmpNonStaticP();
		ESP.Emp(1, "Yogesh", 25000f, 'A');
		System.out.println("*******************");
		EmpNonStaticP ESP1=new EmpNonStaticP();
		ESP1.Emp(2, "bhushan", 30000.30f, 'A');

	}

	
	public void Emp(int Emp_id,String Emp_Name, float Emp_sal,char Emp_grade ) {
		
		System.out.println("Employee Id  :"+Emp_id);
		System.out.println("Employee Name  :"+Emp_Name);
       System.out.println("Employee Salary :"+Emp_sal);
		System.out.println("Employee grade  :"+Emp_grade);


		
		
	}
}
