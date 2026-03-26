package Exam_1;

import java.util.Scanner;

public class Test_02_Check_String_Length {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scanner.next();

        if (s.length() > 10) {
            System.out.println("Length of string is greater than 10 and length is: " + s.length());
        }
        else {
            System.out.println("Length of a string is: " + s.length());
        }
        scanner.close();
    }
}
