package ex_21_OOps_Encap_Access_Modifiers.Police;

public class JrCop {
    static void main(String[] args) {
        Cop jrCop = new Cop(20);
        jrCop.canIShoot();
        jrCop.thisDefaultF1();
    }
}
