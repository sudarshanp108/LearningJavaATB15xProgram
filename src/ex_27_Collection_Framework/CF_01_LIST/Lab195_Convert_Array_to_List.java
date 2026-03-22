package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab195_Convert_Array_to_List {
    static void main(String[] args) {
        String arr[] = {"Java","Python","C#"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
