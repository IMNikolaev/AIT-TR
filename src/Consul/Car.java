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

    public boolean startCar (){
        if (gaz){
                System.out.println("Двигатель и так был заведен");
        }
        else {
            gaz = true;
            System.out.println("заводить двигатель");
        }
        return true;
    }
    public boolean stopCar (){
        if (gaz) {
            gaz = false;
            System.out.println("выключать двигатель");
        }
        else {
            System.out.println("Двигатель и так был остановлен");
        }
        return false;
    }
    public void beep(String bee) {
        System.out.println(bee);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
