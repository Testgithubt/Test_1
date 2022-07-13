package Generalization;

public class SBI implements RBI {

	@Override
	public void loan() {
		
		System.out.println("SBI loan rate is 9.8%");
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("Withdraw the money in day upto 50000");
		
	}

	@Override
	public void deposite() {
		
		System.out.println("Deposite amount is 100000");
		
	}
 
	
}
