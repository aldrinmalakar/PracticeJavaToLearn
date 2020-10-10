package javaPractice.arrayListPractice;

import java.util.Scanner;

public class practiceArrayMatrix {

	public static void main(String[] args) {
		array();

	}

	public static void array() {

		Scanner input = new Scanner(System.in);
		int[][] A = new int[2][3];
		int[][] B = new int[2][3];

		// Getting user input for A 2D Array
		System.out.println("Enter 6 numerical values for the list A");
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {
				System.out.printf("A [%d][%d]=", row, col);
				A[row][col] = input.nextInt();
			}

		}

		// Getting user input for B 2D Array
		System.out.println("Enter 6 numerical values for the list B");
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {
				System.out.printf("B [%d][%d]=", row, col);
				B[row][col] = input.nextInt();
			}

		}

		// To print the arrays
		System.out.println("Your entered Values for list A are");
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print("\t"+" " + A[row][col]);

			}
			System.out.println();

		}

		// To print the arrays
		System.out.println("Your entered Values for list B are");
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print("\t"+" " + B[row][col]);

			}
			System.out.println();
		}
	}
}
