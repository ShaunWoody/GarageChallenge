package com.qa.veichle;

public class Car extends Veichle {

	private int doors;
	
	
	public Car(String model, String lisenceplate,int doors) {
		super(4, model, lisenceplate, "Medium");
		// TODO Auto-generated constructor stub
	}


	public int getDoors() {
		return doors;
	}


	@Override
	public String toString() {
		return "Car || doors: " + doors + ", " + super.toString();
	}


    
	
	

}
