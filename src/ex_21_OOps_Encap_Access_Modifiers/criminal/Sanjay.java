package ex_21_OOps_Encap_Access_Modifiers.criminal;

import ex_21_OOps_Encap_Access_Modifiers.Police.Cop;

public class Sanjay extends Cop {
    public Sanjay(int bullet) {
        super(bullet);
    }

    static void main(String[] args) {
        Cop sanjay = new Cop(10);
//        sanjay.canIShoot();       // cannot be accessed outside of package from Police
//        sanjay.thisDefaultF1();   // cannot be accessed outside of package from Police
    }
}
