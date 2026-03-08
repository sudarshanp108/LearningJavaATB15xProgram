package ex_19_OOPs_02_Polymorphism.MethodOverloading;

public class MathOperations {
    static void main(String[] args) {
        MathOps m = new MathOps();
        int a1 = m.add(5, 10);
        System.out.println(a1);
        int a2 = m.add(5, 6, 7);
        double a3 = m.add(2.34, 3.4);
        String a4 = m.add("Hi", "Hello");
        System.out.println(m.add("Hi", "Hello"));
    }
}

//MOL is in the same class with the same method name with different parameters(args) and return type
class MathOps {
    int add(int a, int b) {
        return a+b;
    }

    int add(int x, int y, int z) {
        return x+y+z;
    }

    double add(double a, double b) {
        return a*b;
    }

    String add(String a, String b) {
        return a+b;
    }
}
