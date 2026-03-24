package ex_27_Collection_Framework.CF_02_SET;

import java.util.*;

public class Lab199_SET_HS_LHS_TS {
    static void main(String[] args) {
        // HASHSET
        Set<String> hs = new HashSet<>();  // can also use specific datatype
        hs.add("apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon"); // duplicates are not allowed
        hs.add(null);
        hs.add("Apple");
//        hs.add(123);
        System.out.println(hs);
        System.out.println(" ---------------------------");

//        LINKEDHASHSET
        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("waterMelon");
        lhs.add(null);
        lhs.add("Apple");
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        System.out.println(" ---------------------------");
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon"); // duplicates not allowed
        System.out.println(ts);
//        ts.add(123);
//        ts.add(null);     //  does not allow duplicate or null elements
    }
}
