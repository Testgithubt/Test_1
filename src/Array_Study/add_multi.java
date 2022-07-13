package Array_Study;

public class add_multi {

	public static void main(String[] args) {
     int row=2; int col=3;
		int firstMatrix[][]= {{2,3,4},{4,5,6}};
		int SecondMatrix[][]= {{2,5,6},{4,3,6}};
		
		int sum[][]=new int  [row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=firstMatrix[i][j]+SecondMatrix[i][j];
				System.out.print(sum[i][j] +" ");


			}
			System.out.println();

		}
		
		
		
	}

}
