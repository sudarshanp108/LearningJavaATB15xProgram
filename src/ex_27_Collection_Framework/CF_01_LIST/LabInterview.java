package ex_27_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LabInterview {
    static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);
        // how to reverse an ArrayList
        Collections.sort(al, Collections.reverseOrder());

        for (Object x: al) {
            System.out.println(x);
        }

    }
}


