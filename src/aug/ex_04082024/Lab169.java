package aug.ex_04082024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson("Pramod");
        ATBPerson p2 = new ATBPerson("Amit");
        ATBPerson p3 = new ATBPerson("Praveen",976543210);
        System.out.println(p0.name);
        System.out.println(p1.name);
        System.out.println(p2.phone);



        System.out.println(p3.name);
        System.out.println(p3.phone);

    }
}
