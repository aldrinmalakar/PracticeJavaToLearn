package MahmudsFIles.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectionDifference {


    public static void main(String[] args) {
        int [] num1={1,3,5,7,9,11,8,4,23};
        int [] num2={2,4,6,8,10,12,3,7,44};

        Set<Integer> number1=new HashSet<Integer>();
        number1.addAll(    Arrays.asList(   new Integer [] {1,3,5,7,9,11,8,4,23}     )     );

        Set<Integer> number2=new HashSet<Integer>();
        number2.addAll(Arrays.asList(new Integer [] {2,4,6,8,10,12,3,7,44}));

        // To Do Union Set
        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of two Set "+union);

        // To Do Intersection
        Set<Integer> intersection= new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Intersection of two Set "+intersection);

        // To Do Symmetric Difference
        Set<Integer> difference= new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of two Set "+difference);






    }





























}
