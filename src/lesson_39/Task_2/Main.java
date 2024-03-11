package lesson_39.Task_2;

import lesson_39.Task_1.MapFrequency;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";
        MapFrequency mapFrequency = new MapFrequency();
        Map<String, Integer> frequencyMap = mapFrequency.stringFrequency(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = mapFrequency.characterFrequency(text);
        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
}
