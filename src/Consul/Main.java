package Consul;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "M5", "Black");
        car.beep("БИ БИ");
        car.startCar();
        car.stopCar();
        car.stopCar();
    }
}
