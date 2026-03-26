package Exam_1;

import java.util.Scanner;

public class Test_04_Compare2Strings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string: ");
        String s1 = sc.next();
        System.out.println("Enter Second string: ");
        String s2 = sc.next();

//        String s1 = "Hello";
//        String s2 = "hello";

        if (s1.equals(s2)) {
            System.out.println("Compared strings are equal");
        }
        else {
            System.out.println("Compared strings are not-equal");
        }
    }
}