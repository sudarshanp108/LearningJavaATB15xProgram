package ex_27_Collection_Framework.CF_03_QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab_LinkedAsQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(8);

        System.out.println(q.peek());

        System.out.println("________");

        // Queue Iteration
        Iterator i = q.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
