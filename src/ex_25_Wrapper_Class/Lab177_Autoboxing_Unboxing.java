package ex_25_Wrapper_Class;

public class Lab177_Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        System.out.println(b); //  b has now attribute, methods -1
        // Boxing - Primitive data type is converted wrapper - Automatic JVM will do it


        Integer aa = 43;
        int a1 = aa; // UnBoxing
        System.out.println(a1); //  aa lost the attribute and behaviour


        int i = Integer.parseInt("123");  // wrapper to primitive conversion
    }
}
