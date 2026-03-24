package ex_27_Collection_Framework.CF_02_SET;

import java.util.*;

public class Lab200_HS_Iteration {
    static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set elements: " + set);

        Iterator i = set.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
    }
    }

