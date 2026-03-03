package ex_17_OOPs;

public class Lab153_Cars_Ex {
    static void main(String[] args) {
        Cars c = new Cars();
        System.out.println(c.name); // Maruti output
        Cars d = new Cars("Honda");
        System.out.println(d.name);  // Honda output
        Cars e = new Cars("Hitachi", "2021");
        System.out.println(e.model);

        LoginPage l1 = new LoginPage("pramod@gmail.com","123");
        System.out.println(l1);
        LoginPage l2 = new LoginPage("abc@gmail.com","143","Yes",10);

    }
}

class Cars {
    String name;
    int year;
    String model;

    Cars() {
        name = "Maruri";
        year = 2000;
        model = "sdf";
    }

    Cars(String s1) {
        this.name = s1;
    }

    Cars(String s1, String modelGiven) {
        this.name = s1;
        this.model = modelGiven;
    }
}
