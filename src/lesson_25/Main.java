package lesson_25;

public class Main {
    public static void main(String[] args) {
        RubberArrayV2 ra = new RubberArrayV2<String>();
        ra.add("abc");
        ra.add("cbd");
        ra.add("abc");
        System.out.println(ra.size());
        System.out.println(ra.indexOf("abc"));
        System.out.println(ra.lastIndexOf("abc"));
        System.out.println(ra.remove(1));
        System.out.println(ra.size());
        System.out.println(ra.indexOf("abc"));
        System.out.println(ra.lastIndexOf("abc"));
        ra.remove(1);
        System.out.println(ra.size());
        RubberArrayV2 ra1 = new RubberArrayV2<String>();
        System.out.println(ra1.isEmpty());
        ra1.add("123");
        System.out.println(ra1.isEmpty());
        System.out.println(ra1);
        ra.add("abc");
        ra.add("cbd");
        ra.add("abc");
        System.out.println(ra);

    }
}
