package Consul;

public class Car {
    private String companyName;
    private String model;
    private String color;
    private boolean gaz= false;

    public Car (String companyName, String model, String color){
        this.companyName= companyName;
        this.model = model;
        this.color = color;
    }

    public void startCat (boolean gaz){
        gaz= true;
        System.out.println("заводить двигатель");
    }
    public void stopCat (boolean gaz){
        gaz= false;
        System.out.println("выключать двигатель");
    }
    public void beep(String bee) {
        System.out.println(bee);
    }
}
