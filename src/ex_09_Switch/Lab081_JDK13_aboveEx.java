package ex_09_Switch;

public class Lab081_JDK13_aboveEx {
    static void main(String[] args) {
        // in JDK > 13
        int itemCode  = 002;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
