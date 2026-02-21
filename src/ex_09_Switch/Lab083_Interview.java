package ex_09_Switch;

public class Lab083_Interview {
    static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10"); // prints -1 i.e 10
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
