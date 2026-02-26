package ex_14_Strings;

public class Lab123_IQ2 {
    static void main(String[] args) {
        // total no of strings present ?  2 and present in SCP
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
        String s11 = "hello";


        // 3 separate string present in Object Area/Heap Area
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
    }
}
