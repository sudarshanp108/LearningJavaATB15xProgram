package ex_05_TypeCasting;

public class Lab_041_Typecasting {
    static void main(String[] args) {
        byte b = 10;
        int a = b; // widening ->  implicit  byte to int
        int a1 = (int)10; // widening ->  explicit byte to int
        System.out.println(a1);
    }
}
