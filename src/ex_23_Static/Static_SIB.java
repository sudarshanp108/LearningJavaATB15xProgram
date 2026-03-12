package ex_23_Static;

public class Static_SIB {
    static void main(String[] args) {
        A a = new A();
    }
}

class A {
    static {
        System.out.println("called only once when class is loaded");
        System.out.println("Can write code");
    }
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
    }

    static int a = 10;

    static void m1() {
        System.out.println("static functionc");
    }
}