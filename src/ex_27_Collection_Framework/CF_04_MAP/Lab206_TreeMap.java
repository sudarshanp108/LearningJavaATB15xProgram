package ex_27_Collection_Framework.CF_04_MAP;

import java.util.Map;
import java.util.TreeMap;

public class Lab206_TreeMap {
    static void main(String[] args) {
        Map prices = new TreeMap();
        prices.put("Apple", 100);
        prices.put("Grapes", 50);
        prices.put("Banana", 60);
        prices.put("Cherry", 110);

        System.out.println(prices);
    }
}
