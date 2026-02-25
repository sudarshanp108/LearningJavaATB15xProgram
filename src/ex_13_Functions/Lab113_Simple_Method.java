package ex_13_Functions;

public class Lab113_Simple_Method {
        static void main(String[] args) {
                non_return_function();
                return_int();
        }

        static void non_return_function() {
        System.out.println("Prints something no return or no return type");
        }

        static int return_int() {
        System.out.println("Prints something no return or no return type");
        return 10;
        }

        static boolean return_boolean() {
        System.out.println("Prints something no return or no return typ");
        return true;
        }

        static float return_float() {
        return 3.14f;
        }
 }