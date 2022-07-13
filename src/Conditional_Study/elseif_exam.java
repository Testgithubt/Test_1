package Conditional_Study;

public class elseif_exam {

	public static void main(String[] args) {
		/*If you clear pre-exam --- selected for main exam. 
If you clear main-exam --- selected for interview
If you clear interview --- selected for govt job. 
Else not clear interview --- Not selected for job
Else not clear main exam --- not selected for interview
Else not clear pre exam --- you are fail */

		
		String  exam= "not clear interview";

		if(exam=="Pre Exam")
		{
			System.out.println("Selected For main");
			if(exam=="Clear main")
			{
				System.out.println("selected for interview");
				if(exam=="clear interview")
				{
					System.out.println("Selected for gov job");
				}
			}
			else if (exam =="not clear interview")  
			{
				System.out.println("not selected for job");
			}
		}
		
			else if (exam==" not clear main exam") {
				System.out.println("Not selected for interview");
			}
	
		else {
			System.out.println("You are fail");
		
		}	

	}
}





