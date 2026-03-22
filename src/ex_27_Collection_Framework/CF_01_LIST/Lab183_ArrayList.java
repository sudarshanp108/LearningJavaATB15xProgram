package ex_27_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab183_ArrayList {
    static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("4");
        list.add(true);

        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("2"));
        System.out.println(list.contains(3));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("4"));

//        ArrayList iteration 3 ways
        // simple for loop
        for (int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }

        // each for loop
        for (Object o: list) {
            System.out.println(o);
        }

        // using iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
