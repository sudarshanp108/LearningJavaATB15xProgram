package ex_06_Ternary_Operator;

public class Lab053_Real_Age_Classification {
    static void main(String[] args) {
        // User input give an age from CLI
        // Need to check if user is Minor, Adult, Sr. Citigen
        String age_input_string = args[0];
        System.out.println(age_input_string instanceof String);
        int age_user_input = Integer.parseInt(age_input_string); // CLI pass 25

        String result = (age_user_input < 18) ? "Minor" : (age_user_input <= 60) ? "Adult" : "Sr. Citigen";
        System.out.println(result);

    }
}
