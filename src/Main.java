public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        System.out.println("Vehicle behavior");
        vehicle.start();
        vehicle.stop();

        System.out.println("\nCar behavior");
        car.start();
        car.stop();

        System.out.println("\nMotorcycle behavior");
        motorcycle.start();
        motorcycle.stop();
    }
}
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle stopped");
    }
}


