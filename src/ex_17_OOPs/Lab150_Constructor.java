package ex_17_OOPs;

public class Lab150_Constructor {
    static void main(String[] args) {
        Animal a1 = new Animal();   // created object reference from Animal class
        MySQL a = new MySQL();
        Browser b = new Browser();
        File f = new File();

    }
}

    class MySQL {
        MySQL() {   // default constructor
            System.out.println("MySQL is Connected!");
        }
    }

    class Browser {
            Browser() {  // default constructor
                System.out.println("Browser got connected");
            }
    }

    class File {
        File() {  // default constructor
            System.out.println("Files are opened");
        }
    }
