package ex_24_ENUM;

public class Lab171_Ex {
    static void main(String[] args) {
        System.out.println(ENV.QA.getBaseURL());
        // Here we can write code
        if (ENV.QA.getBaseURL().equalsIgnoreCase("https://qa.myapp.com"));
        {
            System.out.println("Start on QA!!");
        }
    }
}
