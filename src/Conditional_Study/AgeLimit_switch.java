package Conditional_Study;

public class AgeLimit_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =65;
		switch (age) {
		case 16:System.out.println("You are under 18 ");
		break;
		case 18:System.out.println("You Are Eligable For Vote");
        break;
		case 65:System.out.println("You Are Senior  Citizen ");
        break;
		
		default:System.out.println("plz Enter Valid Age");
			break;
		}

	}

}
