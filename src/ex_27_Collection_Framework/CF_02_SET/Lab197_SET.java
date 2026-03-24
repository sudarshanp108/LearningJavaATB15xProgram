package ex_27_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab197_SET {
    static void main(String[] args) {
//        HashAet uses hashing with unique ID's of each variable
//        and display results unordererly/randomly
        Set st = new HashSet();
        st.add("Sudu"); // da67sd7a6sdad68as67da8d67
        st.add("Sam");  //  da67sd7a6sdad68as67da8ddfe
        st.add("Mahi");
        st.add("Sam");

        System.out.println(st);

        Set ts = new TreeSet<>();

        Set lhs = new LinkedHashSet();
    }
}
