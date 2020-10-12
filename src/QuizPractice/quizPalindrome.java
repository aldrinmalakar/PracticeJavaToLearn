package QuizPractice;

import java.util.Scanner;

/*
Quiz: 10-06-20
If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM, DAD,
MADAM are Palindrome. So write java code to check if a given String is Palindrome or not.
 */
//class name is quizPalindrome
public class quizPalindrome {

    /**
     * method to execute the whole argument. Method will be implemented inside the main method by
     * calling it inside the main method to keep the code readable and reusable.
     */
    static void palindromeFinder() {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev)) {
            System.out.print("Method successfully executed. ");
            System.out.print(str + " is a palindrome");
        } else {
            System.out.print("Method successfully executed. ");
            System.out.print(str + " is not a palindrome");
        }
    }

    /**
     * Main method to find the palindrome from user input
     * Author: Aldrin Malakar
     * Date: 10-06-20
     *
     * @param args
     */
    public static void main(String args[]) {

        palindromeFinder();

    }
}