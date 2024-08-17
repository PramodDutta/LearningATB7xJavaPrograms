package aug.ex_17082024;

public class Lab211 {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println("/ by zero!!, You fool!!");
        }
        System.out.println(c);
        System.out.println("End");
    }
}
