package Exam_1;

import java.util.Locale;
import java.util.Scanner;

public class Test_03_String_To_Uppercase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();

        System.out.println("The Uppercase string is: " +s.toUpperCase());
    }
}
