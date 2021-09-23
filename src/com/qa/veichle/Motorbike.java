package com.qa.veichle;

public class Motorbike extends Veichle {

	private boolean gearstick;
	
	public Motorbike(String model, String lisenceplate)
	{
		super(2, model, lisenceplate, "Small");
		this.gearstick = false;
		// TODO Auto-generated constructor stub
	}

	public boolean getGearstick() {
		return gearstick;
	}

	@Override
	public String toString() {
		return "Motorbike || gearstick: " + gearstick + ", " + super.toString();
	}

	

}
