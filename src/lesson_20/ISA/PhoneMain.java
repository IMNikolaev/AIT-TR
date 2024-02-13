package lesson_20.ISA;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone("Simens", 1991);
        System.out.println(phone.phoneInfo());
        PhoneWithScrean phone1 = new PhoneWithScrean("Nokia", 2002,2);
        System.out.println(phone1.phoneInfo());
        phone1.playVideo();

        Android phone2 = new Android("Samsung", 2012, 6, 7.0);
        phone2.updateandroidVersion();
        phone2.updateandroidVersion();
        phone2.updateandroidVersion();
        phone2.updateandroidVersion();
        String androidVersion = String.format("%.1f", phone2.getAndroidVersion());
        System.out.print(phone2.phoneInfo() + " screen size " + phone2.getScreenSize() + " android Version " + androidVersion);
    }
}
