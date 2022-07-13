package Pattrens;

public class P14 {

	public static void main(String[] args) {

		//Row =9 colum=9 space =4
		int star=1;
		int space=4;
	
	for(int i=1;i<=9;i++)
	{
	  for(int j=1;j<=space;j++)
	  {
		  System.out.print("  ");
	  }
	  for(int j=1;j<=star; j++)
	  {
		  System.out.print("* ");
	  }
	  System.out.println();
	  if(i<5)
	  {
		  star=star+2;
		  space--;
	  }
	  else {
		  
		  space++;
		  star=star-2;
	  }
	

	  }
	 

}

	}
