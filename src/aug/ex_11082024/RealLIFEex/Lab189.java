package aug.ex_11082024.RealLIFEex;

public class Lab189 {
    public static void main(String[] args) {
        CHOMRE c = new CHOMRE();
        String s = c.openBrowser("Chrome");
        System.out.println(s);
        c.closeBrowser("Chrome");

        FIREFOX f = new FIREFOX();
        f.openBrowser("ff");
        f.closeBrowser("ff");
        f.takeScreenShot();
    }
}
