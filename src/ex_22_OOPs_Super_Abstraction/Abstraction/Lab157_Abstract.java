package ex_22_OOPs_Super_Abstraction.Abstraction;

public class Lab157_Abstract {
    static void main(String[] args) {

    Son s = new Son();
    s.loan50k();
    s.load10k();
}
}

abstract class Father {
    abstract void loan50k();        // it does not have {  } / incomplete method

    // concrete/complete method
    void load10k() {
        System.out.println("Given");
    }
}

class Son extends Father {
    @Override
    void loan50k() {
        System.out.println("Loan given by son");
    }
}
