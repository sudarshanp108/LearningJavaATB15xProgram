package ex_22_OOPs_Super_Abstraction.Abstraction;

public class Lab162_Interface_Variables {
}

interface boy {
    final int age = 10;
    String notes = "notes";
    void display();
}

class adult implements boy {
    int aa = 10;
    @Override
    public void display() {
        System.out.println(age);
        System.out.println(this.aa);
    }
}

class adult2 implements boy {

    @Override
    public void display() {
        System.out.println(notes);
    }
}
