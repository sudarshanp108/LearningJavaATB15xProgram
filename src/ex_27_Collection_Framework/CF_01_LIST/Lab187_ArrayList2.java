package ex_27_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab187_ArrayList2 {
    static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Bread");
        list.add("paneer");
        list.add("butter");
        list.add("cheeze");
        list.add(123);
        list.add(true);

        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (Object x: list) {
            System.out.println(x);
        }
    }
}
