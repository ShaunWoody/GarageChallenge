package com.qa.veichle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Garage{

	List<Veichle> veichleList = new ArrayList<>();

	public void addVeichle(Veichle[] veichle) {

		for (int i = 0; i < veichle.length; i++) {
			veichleList.add(veichle[i]);
		}

	}

	
	
	
	public void getAll() {

		
		if (veichleList.isEmpty() == true) {
			System.out.println("No cars");
		}
		
		else {
		
		
		
		for (Veichle i : veichleList) {

			
			System.out.println(i.toString());
			

		}

	}
	}

	public Veichle veichleFind(String input) {

		for (Veichle i : veichleList) {
			if (i.getLisenceplate().equalsIgnoreCase(input)) {
				return i;
			}
		
		}
		return null;
		
	}
	
	
	public int veichleBill(Veichle veichlefound) {

		if (veichlefound.getClass() == Car.class) {
			return 100;
		}
		else if (veichlefound.getClass() == Van.class){
			return 150;
		}
		else {
			return 50;
		}
	}

	public void removeVeichle(Veichle found) {
		
				veichleList.remove(found);
			}
		
	public void emptyGarage() {
		
		veichleList.removeAll(veichleList);
		
		
	}
	
	
	public void removeType(String input) {
		
		
		for (int i = 0; i < veichleList.size(); i++) {
			
			if(veichleList.get(i).getClass().getSimpleName().equalsIgnoreCase(input)) {
				veichleList.remove(i);
			}
			
		}
	}
	
	

}
