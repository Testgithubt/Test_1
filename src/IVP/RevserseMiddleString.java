package IVP;

public class RevserseMiddleString {

	public static void main(String[] args) {

		String s="I LOVE MY INDIA";
		String arr[]=s.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2!=0)
			{
				String S1=arr[i];
				arr[i]=rev(S1);
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	private static String rev(String s1) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		return rev;
		
	}

}
