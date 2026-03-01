package ex_16_Arrays;

import java.util.Scanner;

public class Lab143_2D_Right_Triangle {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n for the pattern:");
        int n = scanner.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*" +"|");
            }
                System.out.println();
        }



        // without scanner class
      //  int[][] arr = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
       // for (int i=0; i<arr.length; i++) {
//            for (int j=0; j<=i; j++) {
//                System.out.print("*" + "\t");
//            }
//                System.out.println();
//        }
    }
}
