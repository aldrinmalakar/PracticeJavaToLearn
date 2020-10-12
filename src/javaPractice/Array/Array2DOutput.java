package javaPractice.Array;

import java.util.Scanner;

public class Array2DOutput {
public static void main(String[] args) {
	notMain();
	
}

private static void notMain() {
	Scanner input = new Scanner(System.in);
	int[][] A = new int[2][3];
	

	// Getting user input for A 2D Array
	System.out.println("Enter 6 numerical values for the list A");
	for (int row = 0; row < 2; row++) {

		for (int col = 0; col < 3; col++) {
			System.out.printf("A [%d][%d]=", row, col);
			A[row][col] = input.nextInt();
		}

	}
}
}
