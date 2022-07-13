package Array_Study;

public class String_Array {

	public static void main(String[] args) {

		String name[]=new String[5];
		
		//initlize
		name[0]="Yogesh";
		name[1]="Yogi";
        name[2]="Kangle";
		name[3]="velocity";
		//usages
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		System.out.println("************");
		
		//dynamic for loop
		
	for (int i=0;i<=name.length-1;i++)
	{
		System.out.println(name[i]);
	}
	System.out.println("******");

	for(int i=name.length-1;i>=0;i--)
	{
		System.out.println(name[i]);
	}
}
}