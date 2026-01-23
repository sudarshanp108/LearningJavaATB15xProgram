package ex_04_Operators;

public class Lab_026_Interview_Concat {
    static void main(String[] args) {
        String first_name = "Sudarshan";
        String last_name = "Jarle";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // it will consider first as concat 2nd one also concat
        System.out.println(a + b + first_name + last_name); // 1st add no's then concat strings

        System.out.println(first_name + last_name + (a + b)); // BODMAS - Bracket of Div, mul, add, sub

    }
}
