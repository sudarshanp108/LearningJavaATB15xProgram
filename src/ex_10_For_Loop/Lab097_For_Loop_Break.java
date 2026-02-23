package ex_10_For_Loop;

public class Lab097_For_Loop_Break {
    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
//        for (int i = 0; i < 50; i++) {  // Time, from where to where to, 0 to 49, 50 Times
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("Exit");
    }
}
