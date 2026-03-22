package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab196_Example {
    static void main(String[] args) {
        // Requirement where we want to modify the collection
        // many times, then we always use the linkedlist.
        Scanner scanner = new Scanner(System.in);
        String continueInput = "Y";
        List<String> names = new ArrayList<>();

        while(continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the name that you want to store");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want to add another one? Y/N");
            continueInput = scanner.nextLine();

        }

        for (String name: names){
            System.out.println(name);
        }

        scanner.close();
        //LinkedList l = new LinkedList();
    }
}
