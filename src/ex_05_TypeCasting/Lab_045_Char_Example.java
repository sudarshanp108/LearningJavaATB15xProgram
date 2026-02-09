package ex_05_TypeCasting;

public class Lab_045_Char_Example {
    static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; // Widening

        int num = 66; // Narrow
        char letter = (char) num;
        System.out.println(letter); // display 'B'
    }
}
