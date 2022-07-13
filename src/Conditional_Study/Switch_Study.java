package Conditional_Study;

public class Switch_Study {

	public static void main(String[] args) {
		/*  1-->Welcome to  1 year*
		 *  2-->Welcome to 2 year
		 *   3-->Welcome to 3 year
          4-->Welcome to  4 year*/

        int Year=4;
        switch (Year) {
		case 1:System.out.println("Welcome to first year ");
		break;
		case 2:System.out.println("Welcome to second  year ");
		break;
		case 3:System.out.println("Welcome to Third year ");
		break;
		case 4:System.out.println("Welcome to Four  year ");
		break;
		default:System.out.println("Plz Enter Year 1 to 4");
			break;
		}
	}

}
