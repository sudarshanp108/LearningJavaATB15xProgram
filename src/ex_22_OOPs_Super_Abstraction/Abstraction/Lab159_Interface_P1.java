package ex_22_OOPs_Super_Abstraction.Abstraction;

public class Lab159_Interface_P1 {
    static void main(String[] args) {
        car2 car = new car2();
        car.drive();
    }
}

class car2 implements Breaks, Engine1 {
    void drive() {
        startEngine();
        applyBreak();
        testEngine();
        Engine1.testEngineStatic();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("applyBreak");
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stopEngine");
    }

//    @Override
//    public void testEngine() {
//        Engine1.super.testEngine(); {
//            System.out.println("super");
//        }
//    }
}


interface Breaks {
    void applyBreak(); // Interface and abstract methods cannot have a body and always incomplete
}

interface Engine1 {
    void startEngine(); // Interface and abstract methods cannot have a body
    void stopEngine();  // Interface and abstract methods cannot have a body

    default void testEngine() {
        System.out.println("Complete method Default");
    }

    static void testEngineStatic() {
        System.out.println("Concrete Complete Static");
    }
}