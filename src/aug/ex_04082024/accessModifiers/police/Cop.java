package aug.ex_04082024.accessModifiers.police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun){
        this.gun = gun;
    }
    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }
    // protected = default - minor -
}
