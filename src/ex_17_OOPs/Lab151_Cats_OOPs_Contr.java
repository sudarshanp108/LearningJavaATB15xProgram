package ex_17_OOPs;

import java.lang.reflect.ParameterizedType;

public class Lab151_Cats_OOPs_Contr {
    static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("mufasa");
        Cat c3 = new Cat("lucy");
        Cat c4 = new Cat("spicy");
        Cat c5 = new Cat("oggy");

        System.out.println(c2.name);
        System.out.println(c3.name);

    }
}

class Cat {
    String name;

    Cat() {     // Default Constructor
        System.out.println("1st cat");
        System.out.println(this.name);
    }

    Cat (String nameGiven) {        // Parameterized Constructor
        this.name = nameGiven;
    }

    void running() {
        int local_var = 10; // Local varaible
        System.out.println("Who is running -> " + this.name);
    }
}