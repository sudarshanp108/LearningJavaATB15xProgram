package ex_27_Collection_Framework.CF_01_LIST;

import java.util.Stack;

public class Lab193_Stack {
    static void main(String[] args) {
        Stack s1 = new Stack();
        //  List In and First Out

        Stack s = new Stack();
        s.add("Pramod");
        s.add("Dutta");
        s.add("Amit");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println("------------");
        System.out.println(s.peek()); // display last element i.e Amit
        System.out.println(s);

        System.out.println("------------");
        System.out.println(s.pop());  // deletes last element i.e Amit
        System.out.println(s);

        System.out.println(s.add("Snehal"));
        System.out.println(s);

        s.add("Chetan");
        s.add("Chetan");  // can add same values
        s.push("Vijay");
        System.out.println(s);
        // s.pop(3)

        System.out.println("------------");
        s.add(2,"Lucky"); // adds value at 2nd index
        System.out.println(s);

        System.out.println("------------");
        s.push("Darshan");  // adds value at the end
        s.addLast("JAGMEET");   // adds value at the end
        System.out.println(s);
    }
}
