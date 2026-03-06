package ex_18_OOPs_01_Inheritance.Multilevel_Inheritance;

public class Lab155_MultiLevel {
    static void main(String[] args) {
        Son sandy = new Son();
        sandy.house();
        sandy.money();
        sandy.home();

        Father f = new Father();
        f.gf();
        f.home();
        // f.house(); // cannot get Sons house

        // Dynamic Dispatch
        GrandFather gr = new Son();
        f.gf();
      //  f.house()

        Father f2 = new Son();

    }
}
