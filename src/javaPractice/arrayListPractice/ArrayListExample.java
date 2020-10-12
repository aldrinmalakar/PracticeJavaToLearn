package javaPractice.arrayListPractice;

import java.util.ArrayList;

public class ArrayListExample {
    // Array has fixed size.
    // Arraylist can be extended based on needs

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Aldrin");
        a.add("Emelda");
        a.add("Eme");
        System.out.println(a);
        System.out.println(a.contains("Eme"));

        int x = a.indexOf("Eme");
        int y = a.size();
        System.out.println("The index is: "+x+" and it's size is ["+y+"]");

    }

}
