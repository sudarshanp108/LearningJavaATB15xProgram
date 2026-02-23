package ex_10_For_Loop;

import java.util.Scanner;

public class Lab100_Factorial {
    static void main(String[] args) {
        // simple program
//        int a = 5;
//        int fact = 1;
//        for (int i=1; i<=a; i++) {
//            fact = fact * i;
//        }
//        System.out.println("Factroial is " + fact);

        // Using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer Number");

        int fact = 1;
        if (sc.hasNextInt()) {
            int c = sc.nextInt();
            System.out.println(c);
            for (int i = 1; i<=c; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial is " + fact);
        }
        else {
            System.out.println("Enter valid integer no only");
        }
    }
}
