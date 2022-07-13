package InterfaceStudy;

public interface Mother {
	//create  interface for Mother for multiple Inheritance concept
 void Recipe();
   default void Money() ////we same method in father and mother interface then we create method is default method and call using super keyword in son class

   {
	   System.out.println("Mothers money ");
   }
void nature();
 
}
