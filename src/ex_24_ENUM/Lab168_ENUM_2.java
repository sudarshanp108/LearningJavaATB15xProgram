package ex_24_ENUM;

public class Lab168_ENUM_2 {
    static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case MONDAY -> System.out.println("This Day Monday");
            case SATURDAY -> System.out.println("This Day Saturday");
        }
        System.out.println(API_URLS.valueOf("google"));
        System.out.println(Day.valueOf("TUESDAY"));
    }
}
