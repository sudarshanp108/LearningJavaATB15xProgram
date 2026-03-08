package ex_19_OOPs_02_Polymorphism.MethodOverloading;

public class RealEx {
    static void main(String[] args) {
        WebAutomation a = new WebAutomation();
        a.openBrowser();
        a.openBrowser("Chrome");
    }
}
class WebAutomation {
    void openBrowser() {
        System.out.println("Default Browser!");
    }

    void openBrowser(String b) {
        System.out.println("Starting Browser!" +b);
    }
}
