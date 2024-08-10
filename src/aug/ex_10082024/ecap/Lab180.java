package aug.ex_10082024.ecap;

public class Lab180 {
    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank("Amit",100);
        // set the balance
        // admin

        // amit.name = "dasdd";
        amit.setBal(1000000000,false);
        //amit.setBal();
        System.out.println(amit.getName());


        System.out.println(amit.getBal(false));



        // Write a code to connect with mySQL
        //  Admin
        boolean are_you_admin = true;


        ICICIBank admin = new ICICIBank("admin",1000);
        admin.setBal(50000,true);
        System.out.println(admin.getName());
        System.out.println(admin.getBal(are_you_admin));

    }
}
