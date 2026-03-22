package ex_27_Collection_Framework.CF_01_LIST;

import java.util.Vector;

public class Lab185_Vector {
    static void main(String[] args) {
        // A Vector is a legacy class
        Vector v = new Vector<>();
        v.add("Hi");
        v.add("Santosh");
        v.add("Bobb");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Hi");
        System.out.println(v);
        System.out.println(v.contains("Bobb"));
    }
}
