package IVP;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Number");
		int num = sc.nextInt();
		int count=0;
		
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
			break;
			
		}
	}
		if(count==1)
		{
			System.out.println("Given no is not  Prime Number :"+num);
		}
		else
		{
			System.out.println("Given no is   Prime Number :" +num);

		}
	}
	}


