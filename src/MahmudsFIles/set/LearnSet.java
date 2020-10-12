package MahmudsFIles.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    // Set is an interface which extends collection. it is an un order collection of objects in
    // which duplicate values can not be stored.

    // Set is implemented by HashSet, LinkedHashSet or UseTreeSet.


    public static void main(String[] args) {
        Set<String> mobileBrand=new HashSet<>();
        mobileBrand.add("Apple");
        mobileBrand.add("Samsung");
        mobileBrand.add("Nokia");
        mobileBrand.add("LG");
        mobileBrand.add("Oppo");

        System.out.println(mobileBrand);
        mobileBrand.remove("Nokia");
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.contains("LG"));





    }



}
