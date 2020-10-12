package javaPractice.OOP;

import java.util.Scanner;

public class practiceForLoopMahmud {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many lines do you want?");
        int rowNumber=input.nextInt();
        for (int i=1; i<=rowNumber; i++ ){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}
