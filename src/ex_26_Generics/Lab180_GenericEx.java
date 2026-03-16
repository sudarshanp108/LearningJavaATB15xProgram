package ex_26_Generics;

public class Lab180_GenericEx {
    public static void main(String[] args) {
        result(5, 6);
        result(3.34, 4.45);
        result("pramod", "dutta");

    }

    static <P1> P1 result(P1 a, P1 b) {  // P1 is generic
        return null;
    }
}