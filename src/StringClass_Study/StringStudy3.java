package StringClass_Study;

public class StringStudy3 {

	public static void main(String[] args) {
		
		//endswith()-->return Boolean

		String S="Velocity";
		System.out.println(S.endsWith("ty"));
		System.out.println(S.endsWith("lo"));
		System.out.println(S.endsWith("city"));
		System.out.println("*********");
		
		//StartWith()
		String S1="Nasik";
		System.out.println(S1.startsWith("Na"));
		System.out.println(S1.startsWith("si"));
		
		boolean mystring=S.startsWith("Na");
		System.out.println(mystring);
		System.out.println("************");
		
		//Substring -->Return string
		String Name="Music Is Best Medicine Of To Relax ur Mind ";
		System.out.println(Name.substring(13));
		System.out.println(Name.substring(0, 5));
		
		String  S3=Name.substring(13);
		System.out.println("My String is "+S3);
		System.out.println("***************");
		
		//Concat-->two string compare return string
		String S4="India ";
		String S5="Hindustan";
		System.out.println(S4.concat(S5));
		System.out.println("*************");
		
		String result=S4.concat(S5);
		System.out.println(result);
		System.out.println("************");
		
		//IndexOf()-->Pass char and return index value
		
		String S6="India";
		System.out.println(S6.indexOf('I'));
		System.out.println(S6.indexOf('d'));
		System.out.println(S6.indexOf('n'));
		System.out.println("*************");
		
		//lastIndex()
		
		String S7="INDIA";
		System.out.println(S7.lastIndexOf('I'));
		System.out.println(S7.lastIndexOf('A'));
		System.out.println("***************");
		
		//replace()-->replace char 
		String S8="Automation Testing";
		System.out.println(S8.replace('A', 'M'));
		System.out.println(S8.replace("Automation", "Manual"));
		
		
	}

}
