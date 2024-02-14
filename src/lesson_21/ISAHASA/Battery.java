package lesson_21.ISAHASA;

public class Battery {
    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    private int batteryCharge;

    public Battery(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }
}
