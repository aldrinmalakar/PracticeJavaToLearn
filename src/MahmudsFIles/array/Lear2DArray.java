package MahmudsFIles.array;

public class Lear2DArray {

    // Two D Array/ 2D Array/ Multi Dimension Array

    // DataType [] [] arrayName=new DataType[row][column];
    public static void main(String[] args) {

        String[][] stName = new String[5][4];

        stName[0][0]="sl";
        stName[0][1]="FirstName";
        stName[0][2]="LastName";
        stName[0][3]="Address";

        stName[1][0]="101";
        stName[1][1]="Quazi";
        stName[1][2]="Arafeen";
        stName[1][3]="Queens,NY";

        stName[2][0]="102";
        stName[2][1]="Bushra";
        stName[2][2]="Karim";
        stName[2][3]="Bronx,NY";

        stName[3][0]="103";
        stName[3][1]="Jonny";
        stName[3][2]="Hossain";
        stName[3][3]="Brooklyn,NY";

        stName[4][0]="104";
        stName[4][1]="Seema";
        stName[4][2]="Devi";
        stName[4][3]="Manhattan,NY";

        System.out.println("Student Info "+stName[3][1]);
        System.out.println("Array Length "+stName.length);

        // Nested For Each Loop for 2D Array: Convert 2D to 1D Array then printout
        for (String [] std: stName) {

            for (String st: std) {
                System.out.print(st+" ");
            }
            System.out.println();
        }


    }


}
