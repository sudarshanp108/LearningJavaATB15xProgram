package ex_16_Arrays;

public class Lab136_SUM_of_Array {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
