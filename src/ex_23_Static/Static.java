package ex_23_Static;

public class Static {
    static void main(String[] args) {
        Student s1 = new Student(20);
        Student s2 = new Student(23);

        System.out.println(s1.age);
        System.out.println(s2.age);
        Student.m1();

        System.out.println(s1.course_name);
        System.out.println(s2.course_name);
    }
}

class Student {
    int age;  //  Non Static or Instance Variable , Attribute,
    static String course_name = "ATB";

    public Student(int age) {
        this.age = age;
    }

    static void m1() {
        System.out.println("I am static Method");
    }
}