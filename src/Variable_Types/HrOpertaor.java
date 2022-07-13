package Variable_Types;

public class HrOpertaor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_Details YogeshK=new Employee_Details(); //object create
		YogeshK.emp_id=10;
		YogeshK.emp_name="Yogesh Kangle";
		YogeshK.emp_salary=25000.12f;
		YogeshK.emp_grade='A';
		
		Employee_Details DevyaniP=new Employee_Details(); //create new object from new employee
		DevyaniP.emp_id=11;
		DevyaniP.emp_name="Devyani Patil";
		DevyaniP.emp_salary=50000f;
		DevyaniP.emp_grade='A';
		
		Employee_Details Prashant =new Employee_Details();
		Prashant.emp_id=12;
		Prashant.emp_name="Prasahnt";
		Prashant.emp_salary=40000f;
		Prashant.emp_grade='B';
		
		YogeshK.emp_info(); //method call from Employee
		DevyaniP.emp_info();
		Prashant.emp_info();

	

	}

}
