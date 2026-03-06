package ex_18_OOPs_01_Inheritance.Single_Inheritance;

public class Lab154_Single_Inheritance {
    // Single inheritance
    static void main(String[] args) {
        Son s = new Son();
        s.property();
        System.out.println(s.deposit);

        // Inherited method from Father class
        s.Father_property();
        System.out.println(s.cash_deposit);

    }
}
