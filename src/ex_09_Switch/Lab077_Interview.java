package ex_09_Switch;

public class Lab077_Interview {
    static void main(String[] args) {
        char ch = 'A';
        switch (ch)
        {
            case 65:  // this 65 gives real match
            System.out.println("Matches ASCII");
            break;
            default:
            System.out.println("No Match");
        }
    }
}
