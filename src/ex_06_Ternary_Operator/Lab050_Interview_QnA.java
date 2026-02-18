package ex_06_Ternary_Operator;

public class Lab050_Interview_QnA {
    static void main(String[] args) {
        int x = 10;
        int y = 20;
        int max = x > y ? x : y;
        int min = x > y ? y : x;
        System.out.println(max);
        System.out.println(min);
    }
}
