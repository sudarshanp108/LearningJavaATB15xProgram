package Exam_1;

import java.util.Scanner;

public class Test_05_Reverse_String {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        String reverse = "";

        for (int i=s.length()-1; i>=0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Reversed string is: " +reverse);
    }
}
