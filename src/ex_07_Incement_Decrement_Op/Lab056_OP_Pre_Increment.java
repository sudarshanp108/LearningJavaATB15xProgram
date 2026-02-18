package ex_07_Incement_Decrement_Op;

public class Lab056_OP_Pre_Increment {
    static void main(String[] args) {
        // Pre increment  = increase value 1st then assign it to result.
        int a  = 10;
        int b  = ++a;
        System.out.println(a);
        System.out.println(b);

        // ++a ->  a= a+1
        //  Exp and Result Table (ERT)
        // Line No | a | Result b
        //  5 |  10 | NA |
        //  6 |  11 | 11 |
        // 7 |  11 - a
        // 8 |  11 | 11 - print
    }
}
