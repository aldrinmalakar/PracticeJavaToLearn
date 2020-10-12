package javaPractice.OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * The purpose of this code is to enter a number, possibly from 1 - 10 and print it in the console using
 * switch case statement. Also, to catch an exception using the try catch method.
 * 
 * I would like to run this code until someone runs a positive integer value. 
 */
public class switchCase {

	public static void method() {
		try {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number of choice");
			int digit = userInput.nextInt();
			
			if (digit >= 0) {
				System.out.println("Enter a number with positive value");
			} else {

			switch (digit) {

			case 1:
				System.out.println("Number is one");
				break;
			case 2:
				System.out.println("Number is two");
				break;
			case 3:
				System.out.println("Number is three");
				break;
			case 4:
				System.out.println("Number is four");
				break;
			case 5:
				System.out.println("Number is five");
				break;
			case 6:
				System.out.println("Number is six");
				break;
			case 7:
				System.out.println("Number is seven");
				break;
			case 8:
				System.out.println("Number is eight");
				break;
			case 9:
				System.out.println("Number is nine");
				break;
			case 10:
				System.out.println("Number is ten");
				break;
			default:
				System.out.println("Your number is larger than 10");
				userInput.close();
				}
			}
		}
		 catch (Exception e) {
			System.out.println("Please enter a valid number.");
		} finally {
			System.out.println("Closing application...");
		}
	
	}

	public static void main(String[] args) throws InputMismatchException {
		method();

	}
}
