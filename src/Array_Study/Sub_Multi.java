package Array_Study;

public class Sub_Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=2;
		int col=3;
		int A[][]= {{8,4,3},{9,8,7}};
		int B[][]= {{4,2,1},{6,5,0}};
		int Sub[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Sub[i][j]=A[i][j]-B[i][j];
				System.out.print(Sub[i][j]+" ");
			}
			System.out.println();
		}

	}
}
