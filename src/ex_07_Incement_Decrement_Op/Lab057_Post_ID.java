package ex_07_Incement_Decrement_Op;

public class Lab057_Post_ID {
    static void main(String[] args) {
        int a = 10;
     //   System.out.println(a++);

        // POST increment  = Print first and then increase.
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // ERT ( Exp and Result Table)
        // LNo |  a_post | b
        // 5 |  10 | NA
        // 9 |  11   |  10
    }
}
