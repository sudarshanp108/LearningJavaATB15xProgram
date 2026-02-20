package ex_08_If_Condition;

import java.util.Scanner;

public class Lab070_Else_If_Ladder {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();

        if (a > 20) {
            System.out.println("a is 20");
        } else if (a < 20) {
            System.out.println("a is less");
        } else {
            System.out.println("a == 20");
        }
     //   Scanner.close();
    }
}