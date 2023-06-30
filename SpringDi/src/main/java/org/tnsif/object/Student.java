package org.tnsif.object;

public class Student {

	//DI in the form of object
	Address address;

	//Achieving DI using constructor
	public Student(Address address) {
		super();
		this.address=address;
	}
	
	public void print() {
		//we are calling display method of address class here
		address.display();
	}
	
}
