package MahmudsFIles.arraylist;

import java.util.ArrayList;

public class LearnArraylist {

    // ArrayList

    // ArrayList: No need to declare Array size/ Dynamic Array

    // ArrayList type Array object
     public static ArrayList<Integer> studentMobileNumbers = new ArrayList<Integer>();
      ArrayList<String> studentAddress = new ArrayList<String>();

    public static void main(String[] args) {
        LearnArraylist.studentMobileNumbers.add(334334534);
        LearnArraylist.studentMobileNumbers.add(334453434);
        LearnArraylist.studentMobileNumbers.add(333454345);

        LearnArraylist learn=new LearnArraylist();
        learn.studentAddress.add("Queens,NY");
        learn.studentAddress.add("Bronx,NY");
        learn.studentAddress.add("Brooklyn,NY");



        String[] stName = new String[50000]; // 64*50

        stName[0] = "James";
        stName[1] = "Jack";
        stName[2] = "John";

        // wrapper class:
        // Integer : int
        // Byte : byte
        // Short : short
        // Double : double
        // Boolean : boolean

        ArrayList<Integer> studentId = new ArrayList<Integer>();

        ArrayList<String> studentList = new ArrayList<String>();
        //ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Ala");
        studentList.add("sadia");
        studentList.add("Rois");
        studentList.add("Belayet1");
        studentList.add("Belayet");
        studentList.add("Belayet");
        System.out.println("Size of ArrayList " + studentList.size());

        System.out.println(studentList.get(2));


        // How to retrieve all the value from ArrayList?
        // Using For Each Loop

        for (String st : studentList) {
            System.out.println("Student name : " + st);
        }

        System.out.println("************ After Remove value ***********");
        // studentList.remove(3);
        studentList.remove("Rois");
        studentList.add("Monzurul Hoque");
        for (String st : studentList) {
            System.out.println("Student name : " + st);
        }
        System.out.println("************ List of value ***********");
        System.out.println(studentList);

    }


}
