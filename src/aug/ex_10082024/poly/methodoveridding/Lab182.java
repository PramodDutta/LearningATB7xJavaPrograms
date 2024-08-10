package aug.ex_10082024.poly.methodoveridding;

public class Lab182 {
    // Method overidding | Runtime Poly
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_Ref = new Hound();
        dog_Ref.bark();

        //Hound h2 = new Dog();

    }
}
