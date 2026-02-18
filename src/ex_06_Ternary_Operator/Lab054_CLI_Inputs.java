package ex_06_Ternary_Operator;

public class Lab054_CLI_Inputs {
    static void main(String[] args) {
        // to display marks from CLI
        int a = Integer.parseInt(args[0]);
      //  int b = Integer.parseInt(args[1]);
        System.out.println(a);
     //   System.out.println(b);

        String result = (a > 35) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
