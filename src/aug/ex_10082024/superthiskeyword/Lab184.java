package aug.ex_10082024.superthiskeyword;

public class Lab184 {
}


class Student extends Person {
    // is A relation - inheritance
    @Override
    void message() {
        System.out.println("I am Student message");
    }

    void display() {
        super.message();
    }


}

class Person {
    void message() {
        System.out.println("I am person message");
    }
}