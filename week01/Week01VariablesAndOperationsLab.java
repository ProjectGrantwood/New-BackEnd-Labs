//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	//QUESTION: is there a reason an array of strings is expected as a parameter?
	
	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
			
		int planeSeatsRemaining = 0;
		
		// 2. Create a variable to hold the cost of groceries at checkout

		double costOfGroceries = 0.00;
			
		// 3. Create a variable to hold a person's middle initial

		String middleInitial = "D";
		
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside

		boolean isItHotOutside = false;
		
		// 5. Create a variable to hold a customer's first name

		String firstName = "Ima";
		
		// 6. Create a variable to hold a street address
		
		String streetAddress = "0 Programmer Lane";
		
		// 7. Print all variables to the console
	
		System.out.println("\nThere are " + planeSeatsRemaining + " seats remaining on the plane.");
		System.out.println("\nYou bought $" + costOfGroceries + " worth of groceries, because you didn't actually buy any groceries, you just looked at the shelves.");
		System.out.println("\nHere's a person's middle initial: " + middleInitial + ", which I believe stands for Dean or Dephenestratus.");
		System.out.println("\nIs it hot outside? The answer is " + isItHotOutside + ".");
		System.out.println("\nHere's that same person's first name: " + firstName + ". I guess Dean or Dephenestratus seems less probable as their middle name now, although you never know.");
		System.out.println("\nIn the spirit of violating privacy laws, I found out that " + firstName + " " + middleInitial + ". [last name] lives at " + streetAddress + ".");
		
		
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	
		planeSeatsRemaining -= 2;
		
		// planeSeatsRemaining = -2 !?
		// NOTE: this is probably what actually happens with the record-keeping at real airline companies.

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;

		costOfGroceries += 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		middleInitial = "Q";
		
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was

		String currentSeason = "Summer";
		
		if (currentSeason == "Summer") {
			isItHotOutside = true;
		}
		
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	
		String fullName = firstName + " " + middleInitial + ". Tjavadev";

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		
		System.out.println("\nI am pleased to introduce " + fullName + ", who lives at " + streetAddress + " and does server maintenance at some sort of airline company.");

		
		
	}
}
