package lesson_21.ISAHASA;

public class PhoneMain {
    public static void main(String[] args) {
        SimCard mts = new SimCard("MTC");
        SimCard beeline = new SimCard("BEELINE");
        SimCard megafon = new SimCard("MEGAFONE");
        Phone phone = new Phone("Simens", 1991, mts);
        System.out.println(phone.phoneInfo());
        PhoneWithScrean phone1 = new PhoneWithScrean("Nokia", 2002,beeline,2);
        System.out.println(phone1.phoneInfo());
        phone1.playVideo();

        AndroidPhone phone2 = new AndroidPhone("Samsung", 2012, 6, 7.0, megafon);
        phone2.updateandroidVersion();
        phone2.updateandroidVersion();
        phone2.updateandroidVersion();
        phone2.updateandroidVersion();
        String androidVersion = String.format("%.1f", phone2.getAndroidVersion());
        System.out.print(phone2.phoneInfo() + " screen size " + phone2.getScreenSize() + " android Version " + androidVersion);
    }
}
