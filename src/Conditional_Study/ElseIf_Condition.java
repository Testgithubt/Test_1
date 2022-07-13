package Conditional_Study;

public class ElseIf_Condition {

	public static void main(String[] args) {
		/* if marks>=60--->Your are in First Class
		 * Else if Marks>=50----> Your Are in Second Class
		 * Else if Marks>=40----->Your Are pass
		 * else--->Your are fail*/
		
		int marks =70;
		if(marks>=60)
		{
			System.out.println("Your Are First class");
			
		}
		else if(marks>=50)
		{
			System.out.println("Your in First Class");
		}
		else if(marks>=40)
		{
			System.out.println("Your Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
