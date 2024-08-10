package aug.ex_10082024.poly.methodoveridding;

public class Hound extends Dog {

    @Override
    void bark(){
        System.out.println("I am Hound, i will Bark!!");
    }

    void bike(){
        System.out.println("Biked");
    }

}
