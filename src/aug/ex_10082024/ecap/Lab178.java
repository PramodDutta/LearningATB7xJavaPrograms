package aug.ex_10082024.ecap;
// ## Encapsulation
public class Lab178 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "123";
        System.out.println(vwoLogin.password);
    }
}

class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

