package ex_11_While;

public class Lab101_While {
    static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("hi");  // without incrementation gives infinite loop
            i++;
        }
    }
}
