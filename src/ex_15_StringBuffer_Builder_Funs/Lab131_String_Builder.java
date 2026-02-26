package ex_15_StringBuffer_Builder_Funs;

public class Lab131_String_Builder {
    static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("ABC");
        s1.append(123);
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("Java programming");
        s2.replace(0, 4, "C++");
        System.out.println(s2);
    }
}
