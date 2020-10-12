package MahmudsFIles.linklist;

import MahmudsFIles.arraylist.LearnArraylist;

import java.util.LinkedList;

public class LearnLinkList {
    // >>Manipulation with LinkedList is faster than ArrayList
    // because it uses a doubly linked list, so no bit shifting is required in memory.

    LinkedList<String> stFathersName=new LinkedList<>();
    LinkedList<String> pizzaList=new LinkedList<>();



    public static void main(String[] args) {
        LearnLinkList learn=new LearnLinkList();
        learn.stFathersName.add("William");
        learn.stFathersName.add("Bob");
        learn.stFathersName.add("Daniel");
        learn.stFathersName.add("Mac");
        learn.stFathersName.add("Moody");

        System.out.println(learn.stFathersName.get(2));
        // How to retrieve all the value from linkedList
        for (String st:learn.stFathersName) {
            System.out.println("Father's name "+st);
        }

        learn.getPizzaList();

    }


    public void getPizzaList(){
        pizzaList.add("buffalo chicken");
        pizzaList.add("Mexican Pizza");
        pizzaList.add("Papa johns");
        pizzaList.add("greec Pizza");
        pizzaList.add("vegatable pizza");
        for (String name: pizzaList) {
            System.out.println("Pizza Name : "+name);
        }
        LearnArraylist.studentMobileNumbers.add(343345435);
    }





}
