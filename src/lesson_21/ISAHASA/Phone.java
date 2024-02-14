package lesson_21.ISAHASA;

import lesson_21.BusDriver;

public class Phone {
    private String model;
    private  int yearManufactured;
    private SimCard sim; // агрегация
    private Battery battery;  // композиция
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYearManufactured() {
        return yearManufactured;
    }
    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public Phone (String model, int yearManufactured, SimCard sim) {
        this.model = model;
        this.yearManufactured = yearManufactured;
        this.sim = sim;
        sim.setPhone(this);
        battery = new Battery(100);
    }
    public String phoneInfo(){
        String string = "model " + model + " year " + yearManufactured + " " + sim.getNameMobileSystem()+ " " +sim.signal();
        return string;
    }
}
