package HashMap;

import java.util.HashMap;

public class HashMapExample2 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "String 1");
        map.put(200, "String 2");
        map.put(300, "String 3");
        //map.put(400, "String 4");

        System.out.println("Initial list of elements : " + map);

        map.remove(200);
        System.out.println("Updated list of elements : " + map);

        map.remove(300, "String 3");
        System.out.println("Updated list of elements : " + map);

    }
}
