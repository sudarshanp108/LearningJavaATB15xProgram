package Exam_1;

import java.util.Scanner;

public class Test_01_Count_CharactersOfString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String Name: ");
        String s = sc.nextLine().replaceAll(" ", "");

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println("Total number of characters in given string is: " + count);

        sc.close();
}
}