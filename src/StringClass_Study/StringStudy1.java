package StringClass_Study;

public class StringStudy1 {

	public static void main(String[] args)
	{
		//equals()method study  //always return in boolean format true of false
		
		String S1="Velocity";
		String S2="Velocity";
		String S3="Velocity";
        String S4="Velocity";
        //== will compare memory location
        System.out.println(S1==S2); //memory location compare always.
        System.out.println(S1==S3);
        System.out.println(S1==S4);
        System.out.println("*************");
        String S5="velocity";
        System.out.println(S1==S5);
        System.out.println("************");
        
        //.equals will compare content of string it will be return boolean value 
        
        S1.equals(S3);
        System.out.println(S1.equals(S3));
        System.out.println(S1.equals(S4));
        
        //equalsIgnoreCase()-->here ignore the char capital or small return boolean value
        
        System.out.println(S1.equalsIgnoreCase(S5));
        
        
        
        
        
        
        

		

	}

}
