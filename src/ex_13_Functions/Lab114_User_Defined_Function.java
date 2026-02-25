package ex_13_Functions;

import java.util.Scanner;

public class Lab114_User_Defined_Function {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number a= ");
        int a = scanner.nextInt();
        System.out.println("Enter a number b= ");
        int b = scanner.nextInt();
        int sum = sum_two_numbers(a, b);  // calling "sum_two_numbers" function in main method from line no 17
        System.out.println("Sum of teo no's is= " +sum);
        sum_of_two_number(); // // calling "sum_two_numbers" function in main method from line no 21
    }

    static int sum_two_numbers(int x, int y) {
        return x + y;
    }

    static void sum_of_two_number() {
        System.out.println("Hi,there");
    }
}