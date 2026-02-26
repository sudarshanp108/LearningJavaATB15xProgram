package ex_14_Strings;

public class Lab118_String {
    static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1);

        boolean result = s1.contains("o");
        System.out.println(result);

        // Strings are immutable in nature (i.e not changeable)
     //   s1.toUpperCase(); // This line creates a NEW string, but doesn't store it
        s1 = s1.toUpperCase(); // This stores new uppercase string back to s1
        System.out.println(s1);
    }
}
