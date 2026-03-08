package ex_19_OOPs_02_Polymorphism.MethodOverriding;

public class MOverriding {
    static void main(String[] args) {
        Son s = new Son();
        s.home();
//        s.money();

        Father f = new Father();
        f.home();
    }
}

class Father {
    void home() {
        System.out.println("2BHK home");
        System.out.println("Other property");
    }
    void money() {
        System.out.println("1 Cr");
    }
}

class Son extends Father {
    @Override
    void home() {       // with same method name Son class invokes Father class
        System.out.println("3BHK home");
//        super.home(); // super keyword invokes all properties of father under son class
    }
}
