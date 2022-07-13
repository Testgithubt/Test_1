package Parameter;

public class IPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPL I=new IPL();
		I.ipl(10, "RohitShrma", "MI", 125);
	     System.out.println("*******************");
     	I.ipl(7, "Ishan Kisan", "MI", 200);
    	System.out.println("*******************");
    	I.ipl(8, "Hardik", "MI", 200);
    	System.out.println("*******************");
    	I.ipl(9, "Pant", "MI", 220);

    	

	

	}

	public void ipl(int JerseryNO,String PlayerName,String TeamName,float Runrate)
	{
		System.out.println("Player Jersery No. Is :"+JerseryNO);
		System.out.println("Player PlayerName. Is :"+PlayerName);

		System.out.println("Player TeamName. Is :"+TeamName);

		System.out.println("Player Runrate . Is :"+Runrate);

		
		
	}
}
