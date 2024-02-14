package lesson_21.ISAHASA;

public class PhoneWithScrean extends Phone {

    private int screenSize;

    public int getScreenSize() {
        return screenSize;
    }

    public PhoneWithScrean(String model, int yearManufactured,SimCard sim , int screenSize) {
        super(model, yearManufactured,sim);
        this.screenSize= screenSize;
    }

    public void playVideo () {
        if (screenSize > 1)
        {
            System.out.println("Можно и видео посмотреть");
        }
    }
}
