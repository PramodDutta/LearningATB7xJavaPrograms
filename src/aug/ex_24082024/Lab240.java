package aug.ex_24082024;

public class Lab240 {
    public static void main(String[] args) {
        Person p1 = new Person("Pramod","KA");
        Person p2 = new Person("Lucky","New Delhi");
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Person extends Object{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID ->" + name +  " , Address -> " + address;
    }
}
