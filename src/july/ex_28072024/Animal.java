package july.ex_28072024;

public class Animal {
    String name = "LOL";
    String color;


    void walk(){}
    void talk(){}

    public static void main(String[] args) {
            Animal animalrRef  = null;
            Animal animalrRef2  = new Animal();
            Animal animalrRef3  = new Animal();
            Animal animalrRef4  = animalrRef2;
        System.out.println(animalrRef3.name);
    }
}
