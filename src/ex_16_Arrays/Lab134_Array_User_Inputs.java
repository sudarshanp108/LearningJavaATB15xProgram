package ex_16_Arrays;

import java.util.Scanner;

public class Lab134_Array_User_Inputs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size = sc.nextInt();

        int[] marks = new int[size];
        for (int i=0; i<marks.length; i++) {
            System.out.println("Enter the marks");
            marks[i] = sc.nextInt();
        }
            System.out.println("*****************");
            for (int i=0; i<marks.length; i++) {
                System.out.println(marks[i]);
        }
        System.out.println("*****************");
        // using enhanced for loop
        for(int a: marks){
            System.out.println(a);
        }
    }
}
