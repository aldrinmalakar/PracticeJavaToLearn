package MahmudsFIles.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    // Map: <Key,Value>
    // Map<String, String>
    // name is key
    // "Denys"

    String name="James";

    public static void main(String[] args) {

        Map<String,String> stateMap=new HashMap<>();
        stateMap.put("USA","NY");
        stateMap.put("CANADA","ON");
        stateMap.put("INDIA","DELHI");
        stateMap.put("Australia","perth");
        stateMap.put("Algeria","Bejaia");
        stateMap.put("Bangladesh","DHAKA");
        stateMap.put("Ethiopia","Addis Ababa");

        System.out.println(stateMap.get("CANADA"));

        // How to retrieve all the value from map?
//        for (Map.Entry<String,String> entry:stateMap.entrySet()) {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
        // Alternative Approach
        for (String st: stateMap.keySet()){
            System.out.println(st+" : "+stateMap.get(st));
        }



    }








}
