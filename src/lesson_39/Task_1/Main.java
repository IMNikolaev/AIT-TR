package lesson_39.Task_1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String string = "яблоко яблоко груша груша помидор яблоко яблоко нет хорошо вкусно";
        MapFrequency mapFrequency = new MapFrequency();
        Map<String,Integer> map = mapFrequency.stringFrequency(string);
        System.out.println(map);
    }
}
