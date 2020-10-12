package MahmudsFIles.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {

    // top element from Priority Queue: peek method only peek value from Queue

    public static void main(String[] args) {
        PriorityQueue<String> name=new PriorityQueue<>();
        name.add("James");
        name.add("Rois");
        name.add("william");
        name.add("jack");
        name.add("john");

        System.out.println(name.peek());

        PriorityQueue<Integer> stId=new PriorityQueue<>();
        stId.add(30);
        stId.add(40);
        stId.add(50);
        stId.add(60);
        System.out.println(stId.peek());

        for (Integer id:stId) {
            System.out.println(id);
        }
        System.out.println("using pool Method");
        // Peek() Retrieve but does not remove the head of the queue
        System.out.println(stId.peek());
        // pool() Retrieve and remove the head of the queue
        System.out.println(stId.poll());
        System.out.println("****************");
        for (Integer id:stId) {
            System.out.println(id);
        }


    }




}
