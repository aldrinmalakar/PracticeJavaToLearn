package javaPractice;

import java.util.Scanner;

public class practiceForLoop {

    public practiceForLoop (){
        for (int y=0; y<10;y++){
        Scanner j = new Scanner(System.in);
        System.out.println("Enter number of your choice");
        int i = j.nextInt();

        if (i<=10){
                System.out.println("So far you are about 40 away from the right number");
            } else if (i==50){
                System.out.println("Uhh there you are!");
        } else {
            System.out.println("Bitch get a life!");
        } break;
        }

    }

    public static void main(String[] args) {
practiceForLoop obj = new practiceForLoop();

    }

}


