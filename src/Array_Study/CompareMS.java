package Array_Study;

public class CompareMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[][]= {{1,2,3,4,5},{2,3,4,5,6},{4,2,1,3,6}};
		int B[]= {6,2,3,4,5};
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=4;j++)
			{
				for(int k=0;k<=4;k++)
				{
					if(A[i][j]==B[k])
					{
						System.out.print(A[i][j]);
						System.out.print("");
					}
				}
		}
		
	}

}
}