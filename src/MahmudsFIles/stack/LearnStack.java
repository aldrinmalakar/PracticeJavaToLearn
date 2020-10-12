package MahmudsFIles.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {

    // Stack : LIFO Last in First Out
    // Pushing element on top of the stack: push()
    // Popping element from the top of the stack: pop()
    //  Looks at the object at the top of this stack without removing it from the stack: peek()


    public static void main(String[] args) {

        Stack<String> stAddress=new Stack<>();
        stAddress.push("Queens,NY");
        stAddress.push("Bronx,NY");
        stAddress.push("Jamaica,NY");
        stAddress.push("Brooklyn,NY");
        stAddress.push("Manhattan,NY");

        System.out.println(stAddress);
        System.out.println(stAddress.pop());
        System.out.println(stAddress);

        System.out.println("***********************************");

        Stack<String> ssn=new Stack<>();
        for (int i =0; i<9; i++){
            ssn.push("ssnNumber"+i);
        }

        System.out.println(ssn);

        // How to retrieve all the value and pop?
        Iterator it=ssn.iterator();
        while (it.hasNext()){
            System.out.println(ssn.pop());
        }


        // Retrieve all value
        for (String st:ssn) {
            System.out.println(st);
        }


        Stack <Integer> stMobileNumber=new Stack<>();
        stMobileNumber.push(757658979);
        stMobileNumber.push(757658989);
        stMobileNumber.push(757658999);
        stMobileNumber.push(757658959);
        stMobileNumber.push(757658949);

        LearnStack.stackSearch(stMobileNumber,757658999);


    }



    public static void stackSearch(Stack<Integer> stack, int element){
        Integer pos= stack.search(element);
        if (pos == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position "+pos);
        }


    }













}
