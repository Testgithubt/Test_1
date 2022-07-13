package Method_study;

public class per_anotherclass { //this class call in caluculate_Percentage.java file
	public static void percentage() //here declare regular static method
	{
	float Eng=70;
	float Math=80;
	float Sci=75;
	float Che=80;
	float bio=90;
	float Percentage=(Eng+Math+Sci+Che+bio)/500*100;
	System.out.println("Your percentage is  :"+Percentage);

}
}
