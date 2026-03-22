package ex_27_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab182_List {
    static void main(String[] args) {
        List fruits = List.of("orange", "apple", "mango", "banana");
        System.out.println(fruits);

//        List list = new List();
        List arrayList = new ArrayList(); // we can add different datatype variables
        arrayList.add("Santosh");
        arrayList.add(123);
        arrayList.add(true);
        System.out.println(arrayList);
    }

}
