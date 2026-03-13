package ex_24_ENUM;

public class Lab169_ENUM_3 {
    static void main(String[] args) {
        Hex_Codes h = Hex_Codes.GREEN;
        System.out.println(h.getHexcode());

        System.out.println(Hex_Codes.BLUE.getHexcode());
    }
}

enum Hex_Codes {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;

    Hex_Codes(String hc) {      // constructor
        this.hexcode = hc;
    }

    String getHexcode() {   // to get the values of enum variables
        return this.hexcode;
    }
}