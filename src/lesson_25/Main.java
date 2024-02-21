package lesson_25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RubberArrayV2<String> ra = new RubberArrayV2<>();
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
        RubberArrayV2<String> ra1 = new RubberArrayV2<>();
        System.out.println(ra1.isEmpty());
        ra1.add("123");
        System.out.println(ra1.isEmpty());
        System.out.println(ra1);
        ra.add("abc");
        ra.add("cbd");
        ra.add("abc");
        System.out.println(ra);
        RubberArrayV2<Integer> intRa = new RubberArrayV2<>();

        intRa.add(1);
        intRa.add(1);
        intRa.add(1);
        intRa.add(1);
        intRa.add(1);
        Integer [] array = intRa.toArray();
        System.out.println(Arrays.toString(array));


    }
}
