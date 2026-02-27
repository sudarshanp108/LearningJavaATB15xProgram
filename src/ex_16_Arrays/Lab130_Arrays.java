package ex_16_Arrays;

public class Lab130_Arrays {
    static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6};

        // 2nd way to create the array
        int[] marks2 = new int[5];
        int mark3[] = new int[5]; // Fixed Size of 5


        String[] names = new String[3];
        names[0] = "sudu";
        names[1] = "hari";
        names[2] = "Yashika";

        System.out.println(marks[0]); //1
        System.out.println(marks2[0]); // 0 default values of empty array is zero
        System.out.println(names[0]);
    }
}
