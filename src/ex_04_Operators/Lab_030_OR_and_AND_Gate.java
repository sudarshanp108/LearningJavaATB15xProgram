package ex_04_Operators;

public class Lab_030_OR_and_AND_Gate {
    static void main(String[] args) {
        // OR Gate any one is true returns true
        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true);  // True
        System.out.println(false || false); // False

        // AND Gate inf both are true then only returns true
        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False
    }
}
