package ex_14_Strings;

public class Lab127_String_Functions {
    static void main(String[] args) {
        // only for learning not for QA Automation
        String s= "Java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "ABC".compareTo("abc"); // compare the ASCII values of first letter output: -32
        int result1 = "abc".compareTo("abc"); // if same returns zero
        int result2 = "abc".compareTo("ABC"); // compare the ASCII values of first letter output: 32
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // 3
        System.out.println(idx2);

        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("*", "Java", "Python"); // Java*Python
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

        String b2 = "Java".concat("Mava"); // JavaMava
        System.out.println(b2);
    }
}
