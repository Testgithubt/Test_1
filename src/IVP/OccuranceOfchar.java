package IVP;

import java.util.HashSet;
import java.util.Scanner;

public class OccuranceOfchar {

	public static void main(String[] args) {
	// 8. Find the first repeated character in the given string
	 Scanner sc = new Scanner(System.in); //scanner object create sc
	   System.out.println("Enter the String");
	      
	    
	      String str=sc.next();// accept string from user   
		//String str ="Selenium";
	
	int len =str.length();
	char ch[]=str.toCharArray();
	
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(ch[i]==ch[j])
			{
				System.out.println("Repeative char  is "+ ch[j]);
				break;
			}
	
			
		}
	}
	
           
        

	}
	
}
