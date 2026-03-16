package ex_26_Generics;

public class Lab179_Gen {
    static void main(String[] args) {
        temp_sum(3,5);
        temp_sum("Sudu","Sam");
    }


//static void temp_sum(Integer a, Integer b) {
//        System.out.println(a);
//        System.out.println(a);
//    }
//    static void temp_sum(String a, String b) {
//        System.out.println(a);
//        System.out.println(a);
//    }


    static <generic> generic temp_sum(generic a, generic b) {
        System.out.println(a);
        System.out.println(a);
        return null;
    }

}
