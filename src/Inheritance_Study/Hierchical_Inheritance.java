package Inheritance_Study;

public class Hierchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Uncle_HI U=new Uncle_HI();
		U.JCB();
		Uncle_HI.Builder();
		
		child1_HI c1=new child1_HI();
		c1.kindness();
		child1_HI.bike();
		
		child2_HI c2= new child2_HI();
		c2.Mobile();
		child2_HI.Games();
		

	}

}
