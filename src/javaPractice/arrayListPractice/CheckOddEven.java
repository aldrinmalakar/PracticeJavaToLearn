package javaPractice.arrayListPractice;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		notMain();

	}

	private static void notMain() {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter a numeral value to find out if it's odd or even.");
		double new1 = input.nextDouble();
		
		if (new1 % 2 == 0) {
			System.out.println("The entered number is an even number");
		} else {
			System.out.println("The number is an odd number");
		}
	} 

}
