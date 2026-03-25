package ex_27_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab204_Map_P3 {
    static void main(String[] args) {
        Map m = new HashMap<>();

        // Map is key-value pair
        // Map uses put and get methods for declaration
        m.put("name", "Sudarshan");
        m.put("ID no", 45);
        m.put("phone", 245615475);
        System.out.println(m);

        // LINKEDHASHMAP
        Map m2 = new LinkedHashMap();
        // order is maintained as user entered
        m2.put("name", "Sudarshan");
        m2.put("ID no", 45);
        m2.put("phone", 245615475);
        System.out.println(m2);

        // TREEMAP
        Map m3 = new TreeMap();
        // natural sorting
        m3.put("name", "Sudarshan");
        m3.put("ID no", 45);
        m3.put("phone", 245615475);
        System.out.println(m3);


    }
}
