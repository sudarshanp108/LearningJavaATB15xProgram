package ex_06_Ternary_Operator;

public class Lab049_Interview_QN {
    static void main(String[] args) {
        int sam_age = 21;
        String result = sam_age > 18 ? (sam_age > 23 ? "You can Vote" : "You can't") : "No you can't vote";
        System.out.println(result);
    }
}
