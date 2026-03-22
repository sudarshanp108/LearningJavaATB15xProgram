package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab188_Nested_ArrayList {
    static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grapes");
//        fruits.add(123);
        System.out.println(fruits);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("papaya");
        fruits2.add("cherry");
        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);

        List All_fruits = new ArrayList();
        All_fruits.add(fruits);
        All_fruits.add(fruits2);
        All_fruits.add(vegatables);
        System.out.println(All_fruits);

        System.out.println(All_fruits.size());
        System.out.println(All_fruits.get(1));



    }
}
