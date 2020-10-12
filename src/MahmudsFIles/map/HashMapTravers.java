package MahmudsFIles.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTravers {

    //	Key Points
    //
    //	For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements present in TreeMap.
    //	TreeMap always keeps the elements in a sorted(increasing) order, while the elements in a HashMap have no order.
    //	TreeMap also provides some cool methods for first, last, floor and ceiling of keys.
    //

    public static void main(String[] args) {
        int [] numbers={23,45,56,34,23,56,33,89,234,45,55,23};
        printFrequency(numbers);

    }

        public static void printFrequency(int[] arr){

            HashMap<Integer,Integer> hmap=new HashMap<>();

            for (int i=0; i<arr.length; i++){

                Integer c=hmap.get(arr[i]);

                if (hmap.get(arr[i])== null){
                    hmap.put(arr[i],1);
                } else {
                    hmap.put(arr[i],++c);
                }
            }

            for (Map.Entry mp:hmap.entrySet()) {
                System.out.println("Frequency of "+mp.getKey()+" : "+mp.getValue());
            }

        }


}
