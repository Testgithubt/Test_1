package Conditional_Study;

public class Grade_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade='B';
		 switch (grade) {
			case 'A':System.out.println("You Are fist class mark>80 ");
			break;
			case 'B':System.out.println("You Are second class mark>60 And mark<80 ");
			break;
			case 'C':System.out.println("You Are  pass  mark>50 And mark<60 ");
			break;
			case 'D':System.out.println(" You are fail");
			break;
			default:System.out.println("Plz enter A to D char");
				break;

	}

	}}
