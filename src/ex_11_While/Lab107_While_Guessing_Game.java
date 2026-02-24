package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab107_While_Guessing_Game {
    static void main(String[] args) {
        // Guess a number from 1 to 100
        // n = 56
        // 90 , number < , 50, numner > , 55,  - 56 - times= 9

        Random random = new Random();
        int NumbertoGuess = random.nextInt(100);
  //      System.out.println(NumbertoGuess); // just to guess no's

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no to Guess!");
        int guess;
        int attempts = 0;

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please Enter valid integer no only");
                scanner.next(); // Consume invalid token
                continue;
            }

            guess = scanner.nextInt();
            attempts++;
            if (guess < NumbertoGuess) {
                System.out.println("Too Low, Try again!!");
            }else if( guess > NumbertoGuess){
                System.out.println("Too High, Try again");
            }else{
                System.out.println("Correct! You have taken -> " +  attempts );
                break;
            }
        }
    }
}
