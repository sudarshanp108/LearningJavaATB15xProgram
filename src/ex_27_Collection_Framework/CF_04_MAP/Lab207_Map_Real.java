package ex_27_Collection_Framework.CF_04_MAP;

import java.util.*;


public class Lab207_Map_Real {
    static void main(String[] args) {
        Map<String,Object> student = new HashMap();
        student.put("name", "Sam");
//        student.put("name", "Uday"); // HashMap cannot have duplicate key
        student.put("Roll no", 23);
        student.put("Mob no", 477234587);
        student.put("Address", "Bellary");

        System.out.println(student);
        System.out.println(student.getOrDefault("role_no",null));
        System.out.println(student.get("Mob no"));

        System.out.println(student.hashCode());
    }
}
