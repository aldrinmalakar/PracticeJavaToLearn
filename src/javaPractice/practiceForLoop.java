package javaPractice;

import java.util.Scanner;

public class practiceForLoop {

    public practiceForLoop (){

        Scanner j = new Scanner(System.in);
        System.out.println("Enter number of your choice");
        int i = j.nextInt();

        if (i == 5 || i == 10) {
            System.out.println("So far we are in the if loop");
        } else {
            System.out.println("Nah bro, we din't make it!");

        }

    }

    public static void main(String[] args) {
practiceForLoop obj = new practiceForLoop();

    }

}


