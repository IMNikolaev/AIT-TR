package lesson_20.ISA;

public class Phone {
    private String model;
    private  int yearManufactured;

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

    public Phone (String model, int yearManufactured) {
        this.model = model;
        this.yearManufactured = yearManufactured;
    }
    public String phoneInfo(){
        return "model " + model + " year " +yearManufactured;
    }
}
