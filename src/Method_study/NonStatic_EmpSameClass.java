package Method_study;

public class NonStatic_EmpSameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object first
		NonStatic_EmpSameClass NE=new NonStatic_EmpSameClass();
		
		
		//then call method
		NE.Emp_Detail();
		

	}
	
	public void Emp_Detail()
	{
		int Emp_id=10;
		String name="yogesh";
		float salary=25000;
		System.out.println("Empolyee id :"+Emp_id);
		System.out.println("Empolyee name :"+name);

		System.out.println("Empolyee salary :"+salary);

		
	}

}
