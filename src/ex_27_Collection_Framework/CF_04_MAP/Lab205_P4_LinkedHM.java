package ex_27_Collection_Framework.CF_04_MAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab205_P4_LinkedHM {
    static void main(String[] args) {
        Map<String, String> countries = new LinkedHashMap();

        countries.put("IN", "India");
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");
        countries.put("JP", "Japan");

        System.out.println(countries);
    }
}
