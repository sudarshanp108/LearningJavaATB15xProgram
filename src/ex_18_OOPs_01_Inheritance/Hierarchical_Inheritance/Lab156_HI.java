package ex_18_OOPs_01_Inheritance.Hierarchical_Inheritance;

public class Lab156_HI {
    static void main(String[] args) {
        Son1 s = new Son1();
        s.s1();

        Son2 S = new Son2();
        S.s2();
        // s1.s2(); // not possible to call son2
        S.home();
        
        Son3 s3 = new Son3();
        s3.home();
    }
}
