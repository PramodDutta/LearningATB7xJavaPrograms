package aug.ex_04082024.hasA.ex;

public class Car {
   // Aggregation - hasA
   protected void StartTheCar(){
        new Engine().start();
        new Tyres().rolling();
    }
}
