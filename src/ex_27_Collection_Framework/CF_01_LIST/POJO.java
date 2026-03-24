package ex_27_Collection_Framework.CF_01_LIST;

public class POJO { // (Plain Old Java Object)

//    static void main(String[] args) {
        private Integer rollNo;
        private String name;

        POJO() {
//            avoid it
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getRollNo() {
            return rollNo;
        }

        public void setRollNo(Integer rollNo) {
            this.rollNo = rollNo;
        }
    }

