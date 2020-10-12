package javaPractice.OOP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class practiceForLoop {
    public static void main(String[] args) {
        System.out.println("Hello! Hw many Stars would you like to print  ");
        Scanner MBD = new Scanner(System.in);
        int number = MBD.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


