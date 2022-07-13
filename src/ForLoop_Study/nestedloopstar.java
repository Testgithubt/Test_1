package ForLoop_Study;

public class nestedloopstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i,j;
		
		for( i=1;i<=5;i++)  //outer loop for rows
		{
			for(j=1;j<=i;j++) //inner loop for columns
			{	
				System.out.println("*");
		}
		System.out.println(); //outer loop statement
		
	}	

	}*/
	


//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row=6;   
//outer loop for rows  
for(i=0; i<row; i++)   
{   
//inner loop for columns  
for(j=0; j<=i; j++)   
{   
//prints stars   
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  


