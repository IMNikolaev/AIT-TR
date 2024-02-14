package lesson_21.ISAHASA;

import java.util.Random;

public class AndroidPhone extends PhoneWithScrean {

    private double androidVersion;

    public double getAndroidVersion() {
        return androidVersion;
    }

    public AndroidPhone(String model, int yearManufactured, int screenSize, double androidVersion, SimCard sim) {
        super(model, yearManufactured,  sim, screenSize);
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
