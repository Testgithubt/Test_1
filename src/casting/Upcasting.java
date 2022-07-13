package casting;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father_Upcasting F= new Father_Upcasting(); 
		F.car();
		F.bike();
		System.out.println("**********");
		
		son_upcasting s=new son_upcasting();
		s.bike();
		s.car();
		s.education();
		System.out.println("***********");
		
		Father_Upcasting F1= new son_upcasting();
		F1.bike();
		F1.car();
		//F1.equals(F1) we cant call education method
		

	}

}
