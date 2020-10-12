package MahmudsFIles.randomnumber;

import java.util.Random;

public class LearnRandomNumber {


    public static void main(String[] args) {
        double [] stId=new double[10];
        Random random=new Random(50);
        for (int i=0; i<stId.length; i++){
            stId[i]=random.nextInt(300);
            System.out.println(stId[i]);
        }

        System.out.println(Math.random());
        System.out.println("NY101"+Math.random());

    }




}
