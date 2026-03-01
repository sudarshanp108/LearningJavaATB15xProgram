package ex_16_Arrays;

public class Lab144_2nd_Highest_No {
    static void main(String[] args) {
        int[] arr = {23, 35, 46, 45, 78, 78};
        int highest = 0;
        int sec_highest = 0;

        for (int max : arr) {
            if (max > highest) {
                sec_highest = highest;
                highest = max;
            } else if (max > sec_highest && max != highest) {
                sec_highest = max;
            }
        }
        System.out.println(sec_highest);
    }
}