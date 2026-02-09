package ex_05_TypeCasting;

public class Lab_044_Example {
    static void main(String[] args) {
        int tax = 200;
        float total_tax = 14.46f;
    //    int total = tax + total_tax;  // narrowing implicit
        int total = tax + (int)total_tax;  // narrowing implicit
        System.out.println(total);
    }
}
