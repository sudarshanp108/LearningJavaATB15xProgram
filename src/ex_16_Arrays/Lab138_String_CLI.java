package ex_16_Arrays;

public class Lab138_String_CLI {
    static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        // enhanced for loop
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}