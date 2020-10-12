package QuizPractice;

import java.util.Scanner;

public class quizIncreasingDecreasing {
    /**
     * Quiz Project:
     * Write a program that accepts three numbers from the user and prints "increasing"
     * if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order,
     * and "Neither increasing or decreasing order" otherwise.
     * Test Data :
     * Input first number: 1524
     * Input second number: 2345
     * Input third number: 3321
     *
     * @Author: 8408MI_Aldrin Malakar
     * Date: 09-30-20
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double firstNumber = in.nextDouble();
        System.out.print("Input second number: ");
        double secondNumber = in.nextDouble();
        System.out.print("Input third number: ");
        double thirdNumber = in.nextDouble();
        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
