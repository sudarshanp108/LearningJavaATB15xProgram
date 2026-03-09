package ex_21_OOps_Encap_Access_Modifiers.Police;

public class Cop {
    private int gun;
    private String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }

    protected void canIShoot() {
        System.out.println("Yes you can Shoot!");
    }

    void thisDefaultF1() {
        System.out.println("Hi new Cop");
    }
}
