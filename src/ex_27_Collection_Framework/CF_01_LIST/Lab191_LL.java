package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab191_LL {
    static void main(String[] args) {

//        List my_list = new ArrayList();
        List mylist = new LinkedList();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);
        mylist.add("hi");
        System.out.println(mylist);

        // List of WebElement
    // Scenario 1 prone to modification - LL, AL  use LinkedList

    // Scenario 2 prone to accessing element - AL, LL  use ArrayList

    }
}