package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer,String>(); //creating Hashmap
        map.put(1, "string1");
        map.put(2, "String2");
        map.put(3, "String3");
        map.put(4, "String4");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
