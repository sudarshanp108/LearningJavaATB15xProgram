package ex_10_For_Loop;

public class Lab096_Odd_Even_nos {
    static void main(String[] args) {
        // even numbers from 1 - 50
        for (int i=1; i<=50; i++)
            if (i % 2 == 0) {
                System.out.println("Even " + i);
            }
            else {
                System.out.println("Odd " +i);
            }
    }
}
