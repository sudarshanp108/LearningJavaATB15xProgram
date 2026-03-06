package ex_18_OOPs_01_Inheritance.Single_Inheritance;

public class Example_SI {
    public static void main(String[] args) {
        Animal a = new Dog2(); // called as Dynamic Dispatch
        a.sound();
    }
}


class Animal {
    void sound() {  // same method name
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal {
    void sound() {  // same method name
        System.out.println("Dog barks");
    }
}
