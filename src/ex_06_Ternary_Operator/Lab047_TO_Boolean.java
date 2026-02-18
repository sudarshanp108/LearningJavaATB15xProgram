package ex_06_Ternary_Operator;

public class Lab047_TO_Boolean {
    static void main(String[] args) {
        int a = 10;
        boolean result = a > 10 ? true : false;
      //  boolean result = Boolean.parseBoolean(a > 10 ? "true" : "false");
        System.out.println(result);
    }
}
