package ex_24_ENUM;

public class Lab_167_ENUM_Call {
    static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());  // shows index position
    }
}
