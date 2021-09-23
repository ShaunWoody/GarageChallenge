package com.qa.veichle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Garage mygarage = new Garage();
		
		Veichle[] addveichletolist = {new Car("Ford","TX4",4),new Motorbike("Harley", "H2W"),new Van("Merc","JK3"),new Car("Clio","SN2",4)};
		
		
		
		
		// Add Veichle 
		mygarage.addVeichle(addveichletolist);
		
		//Get All Veichles
		//mygarage.getAll();
		
		System.out.println("\n ---------------------------------");
		
		//find a veichle
		//Veichle found = mygarage.veichleFind("jk3");
		//System.out.println(found);
		//find the bill for the veichle
		
		//System.out.println(mygarage.veichleBill(found));
		
		System.out.println("\n --------------------------------");
		
		
		
		//mygarage.removeVeichle(found);
		//mygarage.emptyGarage();
		
		
		// Remove car type
		//mygarage.removeType("Car");
		
		//mygarage.getAll();
		
		System.out.println("______________________________");
		Scanner input = new Scanner(System.in);
		
		
		Veichle found;
		
		
		
		while (true) {
			
		System.out.println("1. Find a veichle using lisence plate\n2. List all veichles\n3. Get bill\n4. Remove a veichle\n5. Empty the grarge");

		String x = input.next();
			
		switch (x) {
		case "1":
			System.out.println("Enter lisence plate you want to search: ");
			String veichleinput = input.next();
			System.out.println(mygarage.veichleFind("tx4"));
			break;

		case "2":
			mygarage.getAll();
			break;
			
		case "3":
			System.out.println("Enter lisence plate for the bill: ");
			veichleinput = input.next();
			found = mygarage.veichleFind(veichleinput);
			System.out.println(mygarage.veichleBill(found));
			break;
			
		case "4":
			System.out.println("Enter veichle type you would like to remove: ");
			veichleinput = input.next();
			mygarage.removeType(veichleinput);
			break;
			
		case "5":
			mygarage.emptyGarage();
			System.out.println("Your garage is empty!");
			break;
			
		default:
			System.out.println("Not an option!");
			break;
		}

		
	}
	}


}
