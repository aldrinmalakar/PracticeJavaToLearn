package MahmudsFIles.set;

import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {
        TreeSet<String> mobileBrand=new TreeSet<>();
        mobileBrand.add("Apple");
        mobileBrand.add("Samsung");
        mobileBrand.add("Nokia");
        mobileBrand.add("LG");
        mobileBrand.add("Oppo");

        System.out.println(mobileBrand);
       mobileBrand.remove("Nokia");
       mobileBrand.pollFirst(); // first value will remove
       mobileBrand.pollLast(); // Last value will remove

  System.out.println(mobileBrand);
System.out.println(mobileBrand.contains("LG"));

        // Null point Exception
        //  RuntimeException



    }


}
