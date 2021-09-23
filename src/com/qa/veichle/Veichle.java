package com.qa.veichle;

import java.util.Comparator;

public class Veichle {

	
	private int numofwheels;
	private String model;
	private String lisenceplate;
	private String size;
	
	
	
	public Veichle(int numofwheels, String model, String lisenceplate, String size) {
		this.numofwheels = numofwheels;
		this.model = model;
		this.lisenceplate = lisenceplate;
		this.size = size;
		
		
	}
	public int getNumofwheels() {
		return numofwheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLisenceplate() {
		return lisenceplate;
	}
	public void setLisenceplate(String lisenceplate) {
		this.lisenceplate = lisenceplate;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	@Override
	public String toString() {
		return "numofwheels: " + numofwheels + " |  model: " + model + " | lisenceplate: " + lisenceplate + " | size: "
				+ size;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
