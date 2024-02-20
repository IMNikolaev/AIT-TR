package lesson_25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
