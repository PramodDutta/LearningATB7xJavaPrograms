package aug.ex_11082024.excar;

class Car extends Engine {
    // Engine
    // GearBox
    // Keys

    // Tesla is A Car
    // Tesla - DRIVE()


    @Override
    void openCar() {
        System.out.println("Open Car with keys");
    }

    @Override
    void partGearBox() {
        System.out.println("Part of GearBox");
    }

    @Override
    void stop() {
        System.out.println("Stop a Car");
    }

    @Override
    void speed() {
        System.out.println("Car");
    }

    @Override
    void start() {
        System.out.println("Start a Car");
    }
}
