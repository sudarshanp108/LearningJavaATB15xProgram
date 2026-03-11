package ex_22_OOPs_Super_Abstraction.SuperKeyword;

public class Lab165_SuperKeyword {
    public static void main(String[] args) {
        TestCase t1 =  new TestCase();

    }
}

class BaseClass {
    private int aa;
    private String browser;


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    BaseClass() {
        System.out.println("DC- Parent");
    }


    BaseClass(String browser){
        this.browser = browser;
        System.out.println("PC- Parent");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

class TestCase extends BaseClass{

    void test(){}
    String a;

    TestCase()
    {
        super("chrome");  // called from constructor
        System.out.println("DC-Child");
    }



}
