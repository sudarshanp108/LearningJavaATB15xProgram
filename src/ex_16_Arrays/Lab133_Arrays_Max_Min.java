package ex_16_Arrays;

import java.util.Arrays;

public class Lab133_Arrays_Max_Min {
    static void main(String[] args) {
        // To find the largest number from array
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        Arrays.sort(array); // sort in ascending order first
//        System.out.println(array[array.length - 1]);

        // simple method
        int max = array[0];
        for (int i=0; i<array.length; i++)
        {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // using enhanced for loop
//        for (int x: array)
//        {
//            if (x > max) {
//                max = x;
//            }
//        }
        System.out.println(max);
    }
}
