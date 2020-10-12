package MahmudsFIles.array;

public class Learn3DArray {

    // 3D Array= 1D Array+2D Array

    // DataType[Size][Row][Column] name =new DataType[Size][Row][Column]

    //Declare 3D Array
    static String [][][] pizza= new String[2][6][5];
     String [][][] pizza1= new String[3][4][5];


    public static void main(String[] args) {
        // Add value
        Learn3DArray.pizza[0][0][0]="Sl";
        Learn3DArray.pizza[0][0][1]="Pizza Type";
        Learn3DArray.pizza[0][0][2]="price";
        Learn3DArray.pizza[0][0][3]="qty";
        Learn3DArray.pizza[0][0][4]="Amount";

        Learn3DArray.pizza[0][1][0]="101";
        Learn3DArray.pizza[0][1][1]="American Pizza";
        Learn3DArray.pizza[0][1][2]="30";
        Learn3DArray.pizza[0][1][3]="3";
        Learn3DArray.pizza[0][1][4]="90";

        Learn3DArray.pizza[0][2][0]="102";
        Learn3DArray.pizza[0][2][1]="sicilian";
        Learn3DArray.pizza[0][2][2]="35";
        Learn3DArray.pizza[0][2][3]="2";
        Learn3DArray.pizza[0][2][4]="70";


        Learn3DArray.pizza[0][3][0]="103";
        Learn3DArray.pizza[0][3][1]="bacon Pizza";
        Learn3DArray.pizza[0][3][2]="22";
        Learn3DArray.pizza[0][3][3]="4";
        Learn3DArray.pizza[0][3][4]="88";

        Learn3DArray.pizza[0][4][0]="104";
        Learn3DArray.pizza[0][4][1]="taco pizza";
        Learn3DArray.pizza[0][4][2]="40";
        Learn3DArray.pizza[0][4][3]="4";
        Learn3DArray.pizza[0][4][4]="160";

        Learn3DArray.pizza[0][5][0]="105";
        Learn3DArray.pizza[0][5][1]="deep dish pizza";
        Learn3DArray.pizza[0][5][2]="50";
        Learn3DArray.pizza[0][5][3]="5";
        Learn3DArray.pizza[0][5][4]="250";


        System.out.println("Length of 3D Array is "+Learn3DArray.pizza.length);

        System.out.println(Learn3DArray.pizza[0][4][1]);

        System.out.println("***** How to retrieve all the value from 3D Array? *****");
        // How to retrieve all the value from 3D Array?
        for (String [][] pizz   : Learn3DArray.pizza  ) {
        // Parent for each loop: convert 3D to 2D
            for (String [] piz: pizz) {
                // Child for each Loop: convert 2D to 1D
                for (String pi:piz) {
                    // retrieve all the value from 1D Array
                    System.out.print(pi+"        ");
                }
                System.out.println();
            }


        }




    }










}
