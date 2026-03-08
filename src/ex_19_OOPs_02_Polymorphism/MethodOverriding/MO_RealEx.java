package ex_19_OOPs_02_Polymorphism.MethodOverriding;

public class MO_RealEx {
    // Method Overriding always use Inheritance with the same method name

    static void main(String[] args) {
        Chrome c = new Chrome();
        c.openBrowser();

        Firefox f = new Firefox();
        f.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();

        // Dynamic Dispatch
        CommonToAll c2 = new Chrome();
        c2.openBrowser();

        CommonToAll c3 = new Firefox();
        c3.openBrowser();
    }
}

class CommonToAll {
    void openBrowser() {
        System.out.println("Starting the IE browser.");
    }
}

class Chrome extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Starting the CHROME browser.");
    }

}

class Firefox extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Starting FirefoxTc, Better Browser!!");
    }
}
