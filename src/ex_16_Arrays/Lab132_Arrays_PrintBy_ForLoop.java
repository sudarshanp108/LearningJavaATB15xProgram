package ex_16_Arrays;

public class Lab132_Arrays_PrintBy_ForLoop {
    static void main(String[] args) {
        int[] marks = {80, 45, 34, 53, 65};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("--------------");
        //Simple for loop
        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Enhanced for loop
        for (int x: marks) {
            System.out.println(x);
        }

    }
}
