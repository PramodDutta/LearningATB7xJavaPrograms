package aug.ex_10082024.poly.methodoverloading;

public class Lab181 {
    // Polymorphism

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(2,3);
        double result2 = mathOperations.add(2.4,3.6);
        String result3 = mathOperations.add("Pramod","Dutta");
        String result4 = mathOperations.add("Pramod",123);
        //String result4 = mathOperations.add("Pramod",12.34);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

