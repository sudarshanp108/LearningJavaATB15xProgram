package ex_13_Functions;

import java.util.Scanner;

public class Lab117_Function_Airth_Opertn {
    static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        Scanner scanner = new Scanner(System.in);
        int a = readNo(scanner, "Enter the no1:");
        int b = readNo(scanner, "Enter the no2:");
  //      int c = readNo(scanner, "Enter the no3:");

        // Step 1 --> Easy single step
        System.out.println("Sum of two no's is: " +sum(a, b));
        System.out.println("Sub of two no's is: " +sub(a, b));
        System.out.println("Mul of two no's is: " +mul(a, b));
        System.out.println("div of two no's is: " +div(a, b));
        System.out.println("Mod of two no's is: " +mod(a, b));

        // Step 2 --> Easy two/multiple steps
//        int result_sum = sum(a, b);
//        int result_sub = sub(a, b);
//        int result_mul = mul(a, b);
//        int result_div = div(a, b);
//        int result_mod = mod(a, b);

//        System.out.println(result_sum);
//        System.out.println(result_sub);
//        System.out.println(result_mul);
//        System.out.println(result_div);
//        System.out.println(result_mod);

        scanner.close();
    }
    static int readNo (Scanner scanner, String arg) {
        System.out.println(arg);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        else {
            System.out.println("Enter int value only");
            System.exit(0);
            return 0;
        }
    }
        static int sum (int x, int y) {
        return x+y;
        }
        static int sub (int x, int y) {
        return x-y;
        }
        static int mul (int x, int y) {
        return x*y;
        }
        static int div (int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return x/y;
        }
        static int mod (int x, int y) {
        return x%y;
    }

}
