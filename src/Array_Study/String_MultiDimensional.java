package Array_Study;

public class String_MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initlization and declaration
		String Name[][]= {{"Velocity","Corporate","Training"}, {"center","Katraj","Pune"}};
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(Name[i][j] +" ");
			}
			System.out.println("");
			
		}
		

	}

}
