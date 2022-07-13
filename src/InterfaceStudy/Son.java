package InterfaceStudy;

public class Son implements Father,Mother {

	public static void main(String[] args) {

		Son s= new Son();  //create obj for son class
		s.nature();  //here call father method
		s.Recipe();  // here call mother method
		s.Money();
		
	}

	@Override
	public void Recipe() {

		System.out.println("Mother Recipe ");
		System.out.println("Mother Interface method completed in son class");
	}

	@Override
	public void nature() {

		System.out.println("Father Nature ");
		System.out.println("Father Interface method completed in son class");

	}

	@Override
	public void Money() {
   
		Father.super.Money();
		Mother.super.Money();
		
	}

}
