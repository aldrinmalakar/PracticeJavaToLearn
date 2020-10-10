package javaPractice.arrayListPractice;

import java.util.Scanner;

public class ForLoopDiamond {

	public static void main(String[] args) {
		System.out.println();
		//notMain();
		notMain1();
	}

	private static void notMain() {
		String k = "*";
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < row + 1; col++) {
				System.out.print(" " + k);
			}
			System.out.println();
		}
		for (int row = 0; row < 4; row++) {
			for (int col = 4; col > row + 1; col--) {
				System.out.print(" " + k);
			}
			System.out.println();
		}

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < row + 1; col++) {
				System.out.print(" " + k);
			}
			System.out.println();
		}
		for (int row = 0; row < 4; row++) {
			for (int col = 4; col > row + 1; col--) {
				System.out.print(" " + k);
			}
			System.out.println();
		}
	}

	private static void notMain1() {

		int row, col, halfD;
		System.out.print("Input number of rows (half of the diamond) : ");
		Scanner in = new Scanner(System.in);
		halfD = in.nextInt();
		for (row = 0; row <= halfD; row++) {
			for (col = 1; col <= halfD - row; col++)
				System.out.print(" ");
			for (col = 1; col <= 2 * row - 1; col++)
				System.out.print("*");
			System.out.print("\n");
		}

		for (row = halfD - 1; row >= 1; row--) {
			for (col = 1; col <= halfD - row; col++)
				System.out.print(" ");
			for (col = 1; col <= 2 * row - 1; col++)
				System.out.print("*");
			System.out.print("\n");

		}
	}
}
