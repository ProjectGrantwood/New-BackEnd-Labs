//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] integerArray = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		
		System.out.println(integerArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println(integerArray[integerArray.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?

			// System.out.println(integerArray[6]); // throws an ArrayIndexOutOfBounds exception!!!
		
		// 5. Print out the element in the array at position -1, what happens?

			// System.out.println(integerArray[-1]); // same error as in 4.
			
		// 6. Write a traditional for loop that prints out each element in the array
	
		for (int i = 0; i < integerArray.length; i++){
			System.out.println(integerArray[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		
		for (int num: integerArray){
			System.out.println(num);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum

		int sum = 0;
		for (int num: integerArray){
			sum += num;
		}
		System.out.println(sum);
		
		// 9. Create a new variable called average and assign the average value of the array to it

		double average = (double)sum / (double)integerArray.length;
		System.out.println("Average: " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		
		for (int num: integerArray){
			if (num % 2 == 1){
				System.out.println(num + " is odd");
			}
		}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		
		int nameSum = 0;
		
		for (String name: names){
			nameSum += name.length();
		}
		
		System.out.println(nameSum);
		
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		greet("Mr. Bean");
		greet("Chewbacca");
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		System.out.println(greetWithReturnValue("Notch"));
		System.out.println(greetWithReturnValue("Han Solo"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		System.out.println(
			"Method 13 requires a type declaration of 'void', whereas 14 needs 'String'."
		);
		System.out.println(
			"In order to display something to the user with method 14, you have to actually call the method and print its result, rather than simply call the method."
		);
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		System.out.println(nameIsLongerThan("Tim Berners-Lee", 2023));
		System.out.println(nameIsLongerThan("George Lucas", 9));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		System.out.println(containsString(names, "Thomas"));
		System.out.println(containsString(names, "Tom"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		System.out.println("The smallest value is " + smallestValue(integerArray));
		int[] testArr = {7, 4, 9, 11};
		System.out.println("The smallest value is " + smallestValue(testArr));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double[] doubleArray1 = {-0.5, -31.9, 40.2, 0.5};
		double[] doubleArray2 = doubleArray1.clone();
		doubleArray2[3] = 3.88;
		System.out.println("The average is " + averageOfArray(doubleArray1));
		System.out.println("The average is " + averageOfArray(doubleArray2));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

		int[] nameLengths = getLengths(names);
		for (int i = 0; i < names.length; i++){
			System.out.println(names[i] + " is " + nameLengths[i] + " characters long.");
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
	

	
	// Method 13:

	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	// Method 14:

	public static String greetWithReturnValue(String name) {
		return "Hello, " + name + "!";
	}
	
	// Method 15:

	public static boolean nameIsLongerThan(String name, int maxLength) {
		return name.length() > maxLength;
	}
	
	// Method 16:

	public static boolean containsString(String[] stringArray, String testString) {
		for (String currentString: stringArray) {
			if (testString == currentString) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:

	public static int smallestValue(int[] arrayOfValues) {
		int smallest = arrayOfValues[0];
		for (int val: arrayOfValues) {
			if (val < smallest){
				smallest = val;
			}
		}
		return smallest;
	}
	
	// Method 18:

	public static double averageOfArray(double[] arrayToAverage) {
		double total = 0d;
		for (double val: arrayToAverage) {
			total += val;
		}
		return total / arrayToAverage.length;
	}
	
	// Method 19:

	public static int[] getLengths(String[] arrayOfStrings) {
		int[] lengths = new int[arrayOfStrings.length];
		for (int i = 0; i < arrayOfStrings.length; i++) {
			lengths[i] = arrayOfStrings[i].length();
		}
		return lengths;
	}
	
	// Method 20:
	
	
	// Method 21:
	

}
