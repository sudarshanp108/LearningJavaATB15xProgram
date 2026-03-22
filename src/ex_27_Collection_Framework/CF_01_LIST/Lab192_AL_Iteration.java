package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab192_AL_Iteration {
    static void main(String[] args) {
        List<String> mylist = new ArrayList();
        List<String> mylist2 = new ArrayList<>();


        mylist.add("SAM");
        mylist.add("Jenny");
        mylist.add("Crage");

        System.out.println(" - To Print Arraylist - 1 ");

        for(String name:mylist){
            System.out.println(name);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println(" - To Print Arraylist - 3 ");

        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
