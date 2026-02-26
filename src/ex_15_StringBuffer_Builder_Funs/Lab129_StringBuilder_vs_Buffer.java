package ex_15_StringBuffer_Builder_Funs;

public class Lab129_StringBuilder_vs_Buffer {
    static void main(String[] args) {
        // StringBuilder and StringBuffer are both mutable, character-sequence classes in Java
        // used for efficient string manipulation.
        // The key difference is that StringBuffer is thread-safe (synchronized),
        // making it suitable for multi-threaded environments.
        // StringBuilder is not synchronized and is faster, making it preferred for single-threaded applications.

        // String - 90% used
        String s0 = "Sandy";
        String s1 = new String("ABCD");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Hi");
        StringBuilder stringBuilder = new StringBuilder("Hi");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
