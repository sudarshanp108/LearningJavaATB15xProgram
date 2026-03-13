package ex_25_Wrapper_Class;

public class Lab178_IQ {
    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);       // true (cached)  // it match the value of int data type

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);    // false! (not cached)
        System.out.println(c.equals(d));  // always good to use equals() while using wrappers

        // Java caches Integer values from -128 to 127, so == works for small numbers but fails for larger ones. Always use .equals() for wrapper comparisons.

//        Integer num = null;
//        int value = num;  // NullPointerException!
//        System.out.println(value);

        Integer aaa = 10;
        System.out.println(aaa.toString());
        System.out.println(aaa.toString() instanceof String);
    }
}