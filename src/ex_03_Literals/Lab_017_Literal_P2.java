package ex_03_Literals;

public class Lab_017_Literal_P2 {
    static void main(String[] args) {
        int age = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Binary System
        System.out.println("Binary" +binary_num);

        // Octal base? -> 8
        int octal = 0101;
        System.out.println("octal "+octal);

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745
        System.out.println("Hex " +hex);
    }
}
