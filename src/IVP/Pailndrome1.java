package IVP;

import java.util.Scanner;

public class Pailndrome1 {
	
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter The String ");
	  String str = SC.next();
	  String rev="";
	  for(int i=str.length()-1;i>=0;i--)
	  {
		  rev=rev+str.charAt(i);
	  }
	  System.out.println("Original String is :"+str);
	  System.out.println("Reverse String is :"+rev);
	  if(str.equals(rev))
	  {
		  System.out.println("It is Pailndrome");
	  }
	  else 
	  {
		  System.out.println("It is not Pailndrome");
	  }
	  
		
	}

}
