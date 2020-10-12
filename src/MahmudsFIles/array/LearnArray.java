package MahmudsFIles.array;

public class LearnArray {
    // Single Dimension Array: String []
    // Array: which can hold multiple value of same data type at a time
    // DataType [] variableName = new DataType[numberOfVariables];
    // DataType [] variableName ={};
    // Dimension []

    // Array Index start from zero

    // Variable
    // Data Structure

    // Declare and Initialize value in Variable
    String name="James";

    // Declare Variable
    String price;

    // Declare Array
    static String [] stName = new String[5]; // Global Array

    // Declare Array and Initialize value in Array
    int [] stId={101,102,103,104,105,106,107,108,109,110};

    public static void main(String[] args) {
        // Local Array
        String [] stAddress = new String[5];
        stAddress[0]="Queens,NY";
        stAddress[1]="Bronx,NY";
        stAddress[2]="Brooklyn,NY";
        stAddress[3]="Manhattan,NY";
        stAddress[4]="Buffalo,NY";

        System.out.println(stAddress[4]);

        LearnArray.stName[0]="Sadia";
        LearnArray.stName[1]="Rois";
        LearnArray.stName[2]="Ala";
        LearnArray.stName[3]="Onik";
        LearnArray.stName[4]="Belayet";
        //LearnArray.stName[5]="Inass";
        System.out.println(LearnArray.stName[4]);

        LearnArray learn=new LearnArray();
        //learn.stId[0];
        System.out.println("Student Id : "+learn.stId[5]);

        System.out.println("******* How to print all the value from Array? using For loop **********");
        // How to print all the value from Array?
        // For Loop
        for (int i=0; i<learn.stId.length;i++){
            System.out.println("Student Id : "+learn.stId[i]);
        }

        System.out.println("******* How to print all the value from Array? using For Each Loop **********");

        // For Each Loop
        // for(DataType variableName : arrayName){ }
        for (String st : LearnArray.stName){
            System.out.println("Student Name : "+st);
        }
        System.out.println("******* How to Retrieve value from Array? using For Each Loop **********");
        for (String stAd : stAddress){
            System.out.println("Student Address : "+stAd);
        }

        System.out.println("Array Length "+stAddress.length);

    }


















}
