package Inheritance_Study;


public class multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object superclass of grandfather
		GrandFather_MI M=new GrandFather_MI();
		//calling method nonstatic grandfather superclass
	    M.Farm();
	    //calling method static method for superclass i.e grandfather
	    GrandFather_MI.Nature();
	    
	    //create object father class of Super class
	    Father_MI F=new Father_MI();
	    // calling method nonstatic  father class
	    F.Business();
	    //
	    Father_MI.Love();
		
	    Daughter_MI D= new Daughter_MI();
	    D.scooty();
	    
	    Daughter_MI.Cuteness();
	}

}
