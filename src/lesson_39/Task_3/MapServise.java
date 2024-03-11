package lesson_39.Task_3;

import java.util.HashMap;
import java.util.Map;

public class MapServise {
    public Map<String, Integer> intersectionMap (Map map1, Map map2){
        Map<String,Integer> result = new HashMap<>();
        map1.forEach((key, value) -> { // Хотел через Entry, но Java не дала и заставила сделать так
            String testKey = (String) key;
            if (map2.containsKey(testKey)){
                result.put((String) key, (Integer) value); // Зачем привожу? Сам не знаю! Java не дала и заставила сделать так
            }
        });

        return result;
    }
}
