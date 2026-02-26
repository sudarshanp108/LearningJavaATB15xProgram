package ex_14_Strings;

import java.util.Scanner;

public class Lab_String_Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String name:");
        String s1 = sc.next();
        String Reversed_string = "";

        for (int i=s1.length()-1; i>=0; i--)
        {
            Reversed_string = Reversed_string + s1.charAt(i);
        }
            System.out.println(Reversed_string);

        if (Reversed_string.equalsIgnoreCase(s1))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome!");
        }
    }
}
