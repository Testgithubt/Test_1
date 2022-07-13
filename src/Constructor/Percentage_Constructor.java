package Constructor;

public class Percentage_Constructor {
	
	//declare variable
	float Eng; float Math; float Sci;
	  float Bio;float Che;
	
  public Percentage_Constructor() //user define constructor
  {
	  //Intiliaze the Varaible
	  Eng=70;
	  Math=80;
	  Sci=60;
	  Bio=80;
	  Che=60;
  }
  public static void main(String [] agrs) 
  {
	  //call the object i.e constructor
	  Percentage_Constructor PC=new Percentage_Constructor();
	  //call the method
	  PC.Percentage();
  }
  
  public void Percentage() //Non static Regular Method
  {
	  //usages

  float per=(Eng+Math+Sci+Bio+Che)/500*100;
  System.out.println("My Percentage is  :"+per);
  

}
}

