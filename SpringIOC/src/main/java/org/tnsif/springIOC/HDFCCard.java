package org.tnsif.springIOC;

public class HDFCCard implements DebitCard{

	public void deposit() {
		System.out.println("hdfc-depositing an ammount of 1 lakh rupees");
		
	}

	public void withdraw() {
		System.out.println("hdfc-withdraw an ammount of 20k rupees");
		
	}

}
