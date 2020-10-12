package MahmudsFIles.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {

    public static void main(String[] args) {
        List<String> stateNameOfUSA=new ArrayList<>();
        stateNameOfUSA.add("NY");
        stateNameOfUSA.add("FL");
        stateNameOfUSA.add("NJ");
        stateNameOfUSA.add("CA");
        stateNameOfUSA.add("CT");

        List<String> stateNameOfCanada=new ArrayList<>();
        stateNameOfCanada.add("montreal ");
        stateNameOfCanada.add("Qebec");
        stateNameOfCanada.add("Toronto");
        stateNameOfCanada.add("Vancouber");
        stateNameOfCanada.add("calgery");

        List<String> stateNameOfUK=new ArrayList<>();
        stateNameOfUK.add("liverpool");
        stateNameOfUK.add("manchester");
        stateNameOfUK.add("Scotland");
        stateNameOfUK.add("London");
        stateNameOfUK.add("Wells");

        Map<String,List<String>> stmap=new HashMap<>();
        stmap.put("USA",stateNameOfUSA);
        stmap.put("CANADA",stateNameOfCanada);
        stmap.put("UK",stateNameOfUK);

        for (Map.Entry<String,List<String>>  entry  : stmap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }






    }





}
