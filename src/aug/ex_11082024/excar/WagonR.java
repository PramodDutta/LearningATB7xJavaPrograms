package aug.ex_11082024.excar;

public class WagonR extends Engine{

    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();

    }

    @Override
    void start() {
        System.out.println("Starting Wagon R");
    }

    @Override
    void stop() {
        System.out.println("Stop Wagon R");

    }

    @Override
    void speed() {
        System.out.println("100KM/Hr");
    }

    @Override
    void partGearBox() {
        System.out.println("Wagon/Hr");

    }

    @Override
    void openCar() {
        System.out.println("open Keys");

    }
}
