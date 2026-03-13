package ex_25_Wrapper_Class;

public class Lab176_Wrapper_Conversion2 {
    public static void main(String[] args) {
        String num = "10";
        int aa = 10;

        // String -> Wrapper Conversion
        Integer a = Integer.parseInt(num);

        // Double.parseDouble()
        // Float.parseFloat()
        // Long.parse

        System.out.println(a);

        // String to Primitive int
        int a_p = Integer.parseInt(num);

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);
        System.out.println(aa3 instanceof Integer);



    }

}
