package ex_08_If_Condition;

public class Lab067_If_CLI {
    static void main(String[] args) {
        System.out.println("Enter the age via CLI Option");
        int age = Integer.parseInt(args[0]);

        if (age >= 18)
            System.out.println("Eligible for vote");

    }
}
