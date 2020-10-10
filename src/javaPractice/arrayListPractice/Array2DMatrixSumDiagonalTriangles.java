package javaPractice.arrayListPractice;

import java.util.Scanner;

public class Array2DMatrixSumDiagonalTriangles {

	public static void main(String[] args) {
		notMain();
	}

	/**
	 * ArrayList A =
	 * 
	 * 	5	6	9
	 * 	4	5	6
	 * 	2	8	3
	 * 
	 * Sum diagonally 		5+5+3 = 13
	 * Sum upper triangle 	6+9+6 = 21
	 * Sum lower triangle 	4+2+8 = 14
	 */
	private static void notMain() {
		Scanner input = new Scanner(System.in);
		int[][] A = new int[3][3];
		int sumOfDiagonalElements = 0;
		int sumOfUpperTriangleElements = 0;
		int sumOfLowerTrianglelElements = 0;

		// User input for matrix
		System.out.println("Enter 6 numerical values for the list A");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("A [%d][%d]=", row, col);
				A[row][col] = input.nextInt();
			}
		}
		// To print the arrays
		System.out.println("Your entered Values for list A are");
		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print("\t" + " " + A[row][col]);
			}
			System.out.println();
		}
		// Sum of diagonal, upper, lower
		System.out.println("");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (row == col) {
					sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
				}
				if (row < col) {
					sumOfUpperTriangleElements = sumOfUpperTriangleElements + A[row][col];
				}
				if (row > col) {
					sumOfLowerTrianglelElements = sumOfLowerTrianglelElements + A[row][col];
				}
				
			}
			
		}
		System.out.println("The sum of Diagonal array data is: "+"\t"+"\t"+sumOfDiagonalElements);
		System.out.println("The sum of UpperTriangle array data is: "+"\t"+sumOfUpperTriangleElements);
		System.out.println("The sum of LowerTriangle array data is: "+"\t"+sumOfLowerTrianglelElements);
	}
}
