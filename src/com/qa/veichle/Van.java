package com.qa.veichle;

public class Van extends Veichle {

	public Van(String model, String lisenceplate) {
		super(4, model, lisenceplate, "Large");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Van || " + super.toString();
	}


	
	
	

}
