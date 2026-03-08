package ex_20_OOPs_Encapsulation;

public class Real_Bank_Ex {
    static void main(String[] args) {
        SBIBank sbi = new SBIBank("Shoba", 200);
        long a = sbi.getBal();
        System.out.println(a);
        System.out.println(sbi.getName());

        sbi.setBal(400, true);
        System.out.println(sbi.getBal());
    }
}

class SBIBank {
   private String name;
   private long bal;

   public String getName() {
       return name;
    }

   public void setName(String n) {
       this.name = n;
   }

   public long getBal() {
       return bal;
   }

   public void setBal(long b, boolean isCashier) {
       if (isCashier) {
           this.bal = b;
       }
       else {
           System.out.println("Not allowed to modify bal!!");
       }

//       if (isCashier) {
//           if (b >= 0) { // Check for valid amount
//               this.bal = b;
//               System.out.println("Balance updated successfully.");
//           } else {
//               System.out.println("Error: Balance cannot be negative.");
//           }
//       } else {
//           System.out.println("Not allowed to modify bal!!");
//       }
   }
   public SBIBank(String name, long bal) {
       this.name = name;
       this.bal = bal;
   }
}
