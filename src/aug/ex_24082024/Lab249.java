package aug.ex_24082024;

import static aug.ex_24082024.Lab249.sum;

public class Lab249 {
    public static void main(String[] args) {

        temp("Pramod");
        temp(123);
        temp(true);

        sum(3,4);
        sum("pramod","dutta");

        // T - Ref to the Data Type that you want to use.

    }

    public static <pramod> pramod sum(pramod a, pramod b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <Dutta> void temp(Dutta name) {
        System.out.println(name);
    }
}
