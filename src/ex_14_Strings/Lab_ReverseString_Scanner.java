package ex_14_Strings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_ReverseString_Scanner {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String name:");
        String input = sc.next();
        String reverse = "";
        for (int i = input.length()-1; i>=0; i--)
        {
            reverse = reverse + input.charAt(i);
        }

        System.out.println("Reversed String is: " +reverse);
    }
}
