package ex_11_While;

public class Lab105_While_Check {
    static void main(String[] args) {
        int i = 0;
        while (i < 0) {
            System.out.println(i);
            i++;  // no output
        }
    }
}
