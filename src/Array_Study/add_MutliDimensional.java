package Array_Study;

public class add_MutliDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=2; int column=5;
		int A[][]= {{1,2,3,4,5},{5,6,7,8,9}};
		int B[][]= {{5,6,7,8,9},{2,5,6,4,3}};
		int Sum[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				 Sum[i][j]=A[i][j]+B[i][j];
				 System.out.print(Sum[i][j] +" ");
			}
			System.out.println("");
		}
		
		
	}

}
