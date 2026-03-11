package ex_22_OOPs_Super_Abstraction.Abstraction;

public class Lab158_Better_Abstract_Class {
    static void main(String[] args) {
        Alto car = new Alto();
        car.drive();
    }
}

abstract class car1 {
    abstract void startCar();   // it is incomplete method don't have { }
    abstract void stopCar();
}

class Alto extends car1 {
    void drive() {
        startCar();
        System.out.println("We are driving a Car");
        stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Starting a car alto");
    }

    @Override
    void stopCar() {
        System.out.println("Sopping a car alto");
    }
}
