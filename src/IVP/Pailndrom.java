 package IVP;

import java.util.Scanner;

public class Pailndrom {

	public static void main(String[] args) {
		//string palindrome program
		//i.e if u enter madam--> Rev also-->madam i.e paildrome
		//eg. if u enter welcome ->rev-->emoclew i.e not pailndrome
		
	      Scanner sc = new Scanner(System.in); //scanner object create sc
	      System.out.println("Enter the String");
	      
	      String str=sc.next();// accept string from user      
	      String org_str=str; //get string from and store in str

	      
	      String rev="";
	      int len=str.length(); //find length of string
	      for(int i=len-1;i>=0;i--) //all char from string
	      {
	    	  rev=rev+str.charAt(i);  //reverse string print
	      }
	      System.out.println(rev);    
	      
	     if(org_str.equals(rev))  // both are equals then condition true
	     {
	    	System.out.println("it is pailndrome"); 
	     }
	     else
	     {
		    	System.out.println("it is not pailndrome"); 

	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	      

		

	}

}
