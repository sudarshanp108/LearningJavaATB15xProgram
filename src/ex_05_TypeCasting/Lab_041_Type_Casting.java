package ex_05_TypeCasting;

public class Lab_041_Type_Casting {
    static void main(String[] args) {
        // only used in an primitive datatypes byte, int, float, char, & double
        byte b = 10;
        int a = b; // valid syntax - implicit widening casting - JVM/Java
        System.out.println(a);
        int c = (int)b; // valid syntax - explicit widening - done buy forcefully but data loss
        System.out.println(c);
    }
}
