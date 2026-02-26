package ex_15_StringBuffer_Builder_Funs;

public class Lab_128_String_Functions {
    static void main(String[] args) {
        String name = "Sonal";

        // Builder and buffer function creates Mutable Strings
        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString()); // this converts string to immutable simple String
    }
}
