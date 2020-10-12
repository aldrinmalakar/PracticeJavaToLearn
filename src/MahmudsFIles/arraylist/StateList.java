package MahmudsFIles.arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {

    public static void main(String[] args) {
        List<String> stateNameList=new LinkedList<>();
        stateNameList.add("NY");
        stateNameList.add("NJ");
        stateNameList.add("FL");
        stateNameList.add("CT");
        stateNameList.add("MD");
        stateNameList.add("VA");
        stateNameList.add("MI");
        stateNameList.add("PA");
        stateNameList.add("TX");
        stateNameList.add("NH");
        stateNameList.add("CA");

        // How to retrieve all the value?
//        for (String st:stateNameList) {
//            System.out.println(st);
//        }

        System.out.println(" ******* Before Remove ********");
        Iterator it=stateNameList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(" ******* After Remove ********");
        stateNameList.remove("MI");
        Iterator it1=stateNameList.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }




    }
}
