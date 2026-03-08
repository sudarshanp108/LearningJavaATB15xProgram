package ex_20_OOPs_Encapsulation;

public class Demo_Encap {
    // Constructors are used for Encapsulation

    static void main(String[] args) {
        GmailLogin g = new GmailLogin("Darhan", "S123");
//        String s = g.password;
        System.out.println(g.password);
        g.password = "456";
        System.out.println(g.password);


        GoodGmailLogin g2 = new GoodGmailLogin("Santosh", "S123");
        String s = g2.getName();
        System.out.println(s);
        System.out.println(g2.getPassword());
        g2.setPassword("D123");     // allows to set new password
//        String sa = g2.getPassword();
        System.out.println(g2.getPassword());

    }
}

class GmailLogin {
        public String name;
        public String password;
        public GmailLogin(String name, String pwd) {
            this.name = name;
            this.password = pwd;
        }
}

// using private access modifier
class GoodGmailLogin {
    private String name;
    private String password;

    GoodGmailLogin(String name, String pwd) {
        this.name = name;
        this.password = pwd;
    }

    // if want to access private variables in main method, need to add getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
