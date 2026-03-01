package ex_16_Arrays;

import java.util.Arrays;

public class Lab137_IQ_2nd_High_No {
    static void main(String[] args) {
    int[] arr = {13, 35, 46, 67, 57, 58, 70};  // 13, 35, 46, 57, 58, 67, 70
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

        // using simple for loop
        int max = arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
}
}
