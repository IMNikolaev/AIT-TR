package lesson_20.ISA;

import java.util.Random;

public class Android extends PhoneWithScrean{

    private double androidVersion;

    public double getAndroidVersion() {
        return androidVersion;
    }

    public Android(String model, int yearManufactured, int screenSize, double androidVersion) {
        super(model, yearManufactured, screenSize);
        this.androidVersion = androidVersion;
    }

    public void updateandroidVersion (){
        Random random = new Random();
        boolean randomBoolean = random.nextBoolean();
        if (randomBoolean) {
            androidVersion += 0.1;
        }
    }
}
