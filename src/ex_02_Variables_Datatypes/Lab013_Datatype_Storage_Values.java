package ex_02_Variables_Datatypes;

public class Lab013_Datatype_Storage_Values {
    public static void main(String[] args) {
        int man_age = 10; // waste of memory
        byte man_age2 = 10; // saves memory
        byte age = 127; // max storage value of byte is 128
        System.out.println(age);

        int _=10;
        byte $=45;
        System.out.println($);

        int _123 = 123;
        System.out.println(_123); // we can use _ & $ as variable name
    }
}
