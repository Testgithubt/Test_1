package Conditional_Study;

public class Elseif_condition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =17;
		int weight=25;
		if(age==18 & weight==50)
		{
			System.out.println("You are eligable for blood donation");
			
		}
		else if(age<18 & weight<40)
		{
			System.out.println("You are not eligable for blood donation");
		}
	else if(age< 18 & weight>50 )
		{
			System.out.println("Your age must be >18");
		}
		else {
			System.out.println("You can not donate blood");
		}

	}




	}


