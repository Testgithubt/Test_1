package StringClass_Study;

public class StringStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Contains() -->here we check char or char of squence
		//always return boolean value
		
		String S="Yogesh";
		System.out.println(S.contains("Yo"));
		 boolean result=S.contains("Yog"); // here is result is reference variable
		 System.out.println("result is :"+result);
		 
		 System.out.println(S.contains("gh"));
		 System.out.println("*********");
		 
		 
		 //isEmpty ()-->return boolean and check String empty or not
		 
		 String M="Pune";
		 String N="";
		 String L=" ";
		 String O=null;
		 
		 System.out.println(M.isEmpty());
		 System.out.println(N.isEmpty());
		 System.out.println(L.isEmpty());
		// System.out.println(O.isEmpty());
		// System.out.println(O.length());
		 
		 System.out.println("************");
		 
		 //isBlank()-->return boolean 
		 //if string is 0 or whitespace then return true otherwise  return false
		 String M1="Pune";
		 String N1="";
		 String L1=" ";
		 String O1=null;
		 
		 System.out.println(M1.isBlank());
		 System.out.println(N1.isBlank());
		 System.out.println(L1.isBlank());
		// System.out.println(O1.isBlank());
		 System.out.println("*************");
		 
		 //charAt()--> give intput as int return char
		 
		 String I="INDIA";
		 System.out.println(I.charAt(3));
		 char C=I.charAt(1);  // c as reference variable
		 System.out.println(C);

		 

	}

}
