package InterfaceStudy;

public interface Father {
	//create  interface for Father for multiple Inheritance concept
	 void nature();
	 
	  default void Money()  //we same method in father and mother interface then we create method is default methodand call using super keyword in son class
	  {
		  System.out.println("father money");
	  }

}
