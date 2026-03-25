package ex_27_Collection_Framework.CF_05_Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabComparable {
    static void main(String[] args) {
        employee e1 = new employee(3, "Harsh");
        employee e2 = new employee(2, "Sai");
        employee e3 = new employee(1, "Dev");

        List<employee> employeelist = new ArrayList<>();
        employeelist.add(e1);
        employeelist.add(e2);
        employeelist.add(e3);
        System.out.println(employeelist);

        // SORTED BASED ON id
        Collections.sort(employeelist);

        System.out.println(employeelist);

    }
}
class employee implements Comparable<employee> {
   private Integer id;
   private String name;

   public Integer getId() {
       return id;
    }

   public void setId(Integer id) {
       this.id = id;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

    public String printDetails() {
        return id + " - " + name;
    }

   public employee(Integer id, String name) {
       this.id = id;
       this.name = name;
   }

   @Override
   public String toString() {
       return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
   }

    @Override
    public int compareTo(employee o) {
        return this.id-o.id;
//        return this.name.compareTo(o.name);
    }

}