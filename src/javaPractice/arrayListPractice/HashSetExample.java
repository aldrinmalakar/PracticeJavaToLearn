package javaPractice.arrayListPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        //Hashset might not store data in sequential order.

        HashSet<String> hs = new HashSet<>();
        hs.add("Aldrin");
        hs.add("Eme");
        hs.add("Aldrin");
        hs.add("Shaila");
        hs.add("Jacky");
        System.out.println(hs + ". List size is: " + hs.size());

        Iterator<String> it = hs.iterator();
        it.next();
        it.next();


    }
}
