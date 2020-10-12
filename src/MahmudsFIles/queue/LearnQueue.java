package MahmudsFIles.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    // Queue: FIFO order(First in first out)


    public static void main(String[] args) {
        Queue<String> name=new LinkedList<>();
        name.add("karim");
        name.add("james");
        name.add("sadia");
        name.add("Lamara");
        name.add("Devis");

        for (String st: name) {
            System.out.println("Patient Name "+st);
        }
        System.out.println("***** After Remove *****");
        name.remove("sadia");
        for (String st: name) {
            System.out.println("Patient Name "+st);
        }

        System.out.println("***********************");
        System.out.println(name.element());
        System.out.println("***********************");
        // Peek and remove
        System.out.println(name.poll());
        System.out.println(name.poll()); //
        System.out.println("***********************");
        System.out.println(name.peek()); //

        System.out.println("***********************");
        System.out.println(name.remove()); // only remove value from list
        System.out.println("***********************");
        System.out.println(name.poll());





    }


}
