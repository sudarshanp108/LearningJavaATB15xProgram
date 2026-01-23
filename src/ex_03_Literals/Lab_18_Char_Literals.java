package ex_03_Literals;

public class Lab_18_Char_Literals {
    static void main(String[] args) {
        char c1 = 'A';
        System.out.println(c1);

        char c3 = '@';
        System.out.println(c3);
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Test Driving");
        System.out.println("Hi"+new_line+"Hello");
        System.out.println("Test\nDrive");
        System.out.println("Test"+tab_line+"Driving");
        System.out.println("Test"+back_space+"Driving");
        System.out.println("Test"+carriage_return+"Driving");

        System.out.println( " ----- ");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");
    }
}
