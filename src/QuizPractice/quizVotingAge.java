package QuizPractice;

import java.util.Scanner;

public class quizVotingAge {
    /**
     * Quiz Project:
     * Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote.
     * A person who is eligible to vote must be older than or equal to 18 years old. Enter your age: 18 .You are eligible to vote.
     *
     * @author 8408MI_Aldrin Malakar
     * Date: 09-30-20
     */
    static void checkVotingAge() {

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age?");
        age = sc.nextInt();
        if (age >= 18)
            System.out.println("Congratulations, you can vote.");
        else
            System.out.println("You are not eligible to vote yet.");

    }

    public static void main(String[] args) {
        checkVotingAge();
    }


}
