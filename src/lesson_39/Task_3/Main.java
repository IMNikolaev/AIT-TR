package lesson_39.Task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        MapServise mapServise = new MapServise();

        Map<String, Integer> intersectionMap = mapServise.intersectionMap(map1,map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
