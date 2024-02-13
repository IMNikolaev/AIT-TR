package lesson_20.ISA;

public class PhoneWithScrean extends Phone {

    private int screenSize;

    public int getScreenSize() {
        return screenSize;
    }

    public PhoneWithScrean(String model, int yearManufactured, int screenSize) {
        super(model, yearManufactured);
        this.screenSize= screenSize;
    }

    public void playVideo () {
        if (screenSize > 1)
        {
            System.out.println("Можно и видео посмотреть");
        }
    }
}
