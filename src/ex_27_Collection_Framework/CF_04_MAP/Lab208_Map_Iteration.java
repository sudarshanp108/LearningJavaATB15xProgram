package ex_27_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab208_Map_Iteration {
    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
//        map.put(null, 100);  // only 1 null is allowed
        map.put(null, 120);

        System.out.println(map);

        // Iteration
        for (Map.Entry item: map.entrySet()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
    }
}
