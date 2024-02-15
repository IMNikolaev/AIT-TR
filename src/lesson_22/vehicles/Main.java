package lesson_22.vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        ElectricCar electricCar=new ElectricCar();
        Motorcycle motorcycle=new Motorcycle();
        ElectricMotorcycle electricMotorcycle =new ElectricMotorcycle();
        Bicycle bicycle = new Bicycle();
        ElectricBicycle electricBicycle= new ElectricBicycle();

        Vehicle[] vehicles = new Vehicle[7];
        vehicles[0] = vehicle;
        vehicles[1] = car;
        vehicles[2] = electricCar;
        vehicles[3] = motorcycle;
        vehicles[4] = electricMotorcycle;
        vehicles[5] = bicycle;
        vehicles[6] = electricBicycle;

        printV(vehicles);
    }

    public static void printV (Vehicle[] vehicles){
        for (int i = 0; i < vehicles.length; i++) {

            vehicles[i].startEngine();
        }
    }
}
