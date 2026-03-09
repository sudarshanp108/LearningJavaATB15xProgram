package ex_21_OOps_Encap_Access_Modifiers.Police;

public class Sanjay extends Cop {
    public Sanjay(int bullet) {
        super(bullet);
    }

    static void main(String[] args) {
        Cop sanjay = new Cop(10);
        sanjay.canIShoot();
        sanjay.thisDefaultF1();
    }
}