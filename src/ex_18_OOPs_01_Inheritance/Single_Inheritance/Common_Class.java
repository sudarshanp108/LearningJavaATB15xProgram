package ex_18_OOPs_01_Inheritance.Single_Inheritance;

class Common_Class {
    static void main(String[] args) {
        int test1; Test t = new Test();
        Test t1 = new Test();
        t1.closeBrowser();
        t1.runBrowser();
        System.out.println(t1.s);

        System.out.println("*********************");
        t1.test1();

        browsers b = new Test();  // Dynamic Dispatch
        b.closeBrowser();
        b.readFile();
    }
}


class browsers
{
    String s= "File";
    void startBrowser() {
        System.out.println("Starting the browser!");
    }

    void  runBrowser() {
        System.out.println("Running the Browser");
    }

    void readFile() {
        System.out.println("Reading the file");
    }

    void closeBrowser() {
        System.out.println("Closing Browser!");
    }
}

class Test extends browsers{
    void test1() {
        startBrowser();
        System.out.println("Running test1");
        closeBrowser();


    }
}