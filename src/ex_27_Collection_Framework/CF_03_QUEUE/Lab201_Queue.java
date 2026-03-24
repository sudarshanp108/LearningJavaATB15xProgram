package ex_27_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab201_Queue {
    static void main(String[] args) {
        // Queue -> 0.001% in Automation
        // FIFO
        PriorityQueue q = new PriorityQueue();
//        Queue q1 = new PriorityQueue();
        q.add("Pramod");
        q.add("Patil");
        q.add("Chandu");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());  // display First element
        System.out.println(q);
        System.out.println(q.poll());  // deletes First element
        System.out.println(q);
    }
}
