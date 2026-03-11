package ex_22_OOPs_Super_Abstraction.Abstraction;

public class Lab160_Interface_P2 {
    static void main(String[] args) {
        Son1 s = new Son1();
        s.bhk1(); // its calls its own method not from F1 or F2
    }
}

interface F1 {
    void bhk1();
    void money();
}

interface F2 {
    void money10k();
}

// here multiple Inheritance is possible
// only with interface but calls the subclass methods itself i.e Son
class Son1 implements F1, F2 {

    @Override
    public void bhk1() {
        System.out.println("Sons own house");
    }

    @Override
    public void money() {
        System.out.println("Sons own money");
    }

    @Override
    public void money10k() {

    }
}
