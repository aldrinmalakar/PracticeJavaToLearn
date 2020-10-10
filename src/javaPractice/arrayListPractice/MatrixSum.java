package javaPractice.arrayListPractice;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {

		notMain();

	}

	public static void notMain() {
		Scanner input = new Scanner(System.in);
		int[][] A = new int[2][3];
		int[][] B = new int[2][3];
		int[][] C = new int[2][3];
		

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
		
		//Adding A & B Matrix
		System.out.println("The sum per row is the following:");
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {		
				//Storing the sum of both arrays in another matrix
				C [row] [col] = ( A[row][col] + B [row][col]);
				
				//Printing the sum of Array A and B
				System.out.print("\t"+ C [row] [col] );
			}
			System.out.println();
		}
			//Adding A & B Matrix
			System.out.println("The multiplication of per row is the following:");
			for (int row = 0; row < 2; row++) {

				for (int col = 0; col < 3; col++) {		
					//Storing the sum of both arrays in another matrix
					C [row] [col] = ( A[row][col] - B [row][col]);
					
					//Printing the sum of Array A and B
					System.out.print("\t"+ C [row] [col] );
				}
				System.out.println();
		}
		
	}

}
