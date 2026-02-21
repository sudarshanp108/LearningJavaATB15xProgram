package ex_09_Switch;

import java.util.Scanner;

public class Lab071_Switch {
    static void main(String[] args) {
        // Take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- Basically add step 3 as a rough logic.
        // Step 4 - 4 is write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 to 7 for the week");


      //  if (scanner.hasNextInt()) {  // puting edgecase for resolving InputMismatchException
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please enter a valid number!");
                    break;
            }
  //      }
//            else {
//                System.out.println("Invalid Input! Enter int number only");
//            }
                System.out.println("End of program");
                scanner.close();
    }
}
