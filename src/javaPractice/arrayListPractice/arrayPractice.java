package javaPractice.arrayListPractice;

import java.util.Scanner;

public class arrayPractice {

	public static void main(String[] args) {
		userInput();
	}

	/**
	 * Method to take 5 user input and calculate sum and average of those numbers
	 */
	public static void userInput() {
		int[] arrayVar = new int[5];
		int sum = 0;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter 5 numbers ");

		for (int i = 0; i < arrayVar.length; i++) {
			arrayVar[i] = userInput.nextInt();
		}

		for (int i = 1; i < arrayVar.length; i++) {
			sum = sum + arrayVar[i];
			userInput.close();
		}

		/**
		 * Finding the maximum value out of the user inputs with for loop and if loop
		 */
		int maximum = arrayVar[0];
		for (int i = 0; i < arrayVar.length; i++) {

			if (maximum < arrayVar[i]) {
				maximum = arrayVar[i];
			}
			
		}
		/**
		 * Finding the minimum value out of the user inputs with for loop and if loop
		 */
		int minimum = arrayVar[0];
		for (int i = 0; i < arrayVar.length; i++) {

			if (minimum > arrayVar[i]) {
				minimum = arrayVar[i];
			}
		
	}
		System.out.println("The total amount of all arrays are :" + sum);
		System.out.println("The average of the arrays are :" + sum / arrayVar.length);
		System.out.println("The largest number from the input is :" + maximum);
		System.out.println("The smallest number from the input is :" + minimum);
	}
	
}
