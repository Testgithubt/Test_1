package Inheritance_Study;

public class SingleInheritance {

	public static void main(String[] args) {

		//Calling Mothers properties using mother object 
		
		Mother_SingleInheritance MS= new Mother_SingleInheritance();
		//call the from mother class
		MS.Nature();
		MS.love();
		//call static method
		Mother_SingleInheritance.Kindness();

		//calling Sons properties using sons object 
		 Son_SingleInheritance SS=new Son_SingleInheritance();
		 
		 //call method from sons class
		 SS.mobile();
		 //call static method from son class
		 Son_SingleInheritance.bike();
		 
		
		 SS.love();
		 SS.Nature();
		 Son_SingleInheritance.Kindness();
		 
		 	}

}
