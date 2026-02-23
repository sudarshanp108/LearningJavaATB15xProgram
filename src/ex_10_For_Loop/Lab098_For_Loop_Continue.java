package ex_10_For_Loop;

import java.util.Scanner;

public class Lab098_For_Loop_Continue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        for (int j=0; j<a; j++) {
            if (j == 5) {  // no 5 will scipped in output
                continue;
            }
            System.out.println(j);
        }
    }
}
