package lesson_39.Task_1;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequency {
    public Map<String, Integer> stringFrequency (String string){
        Map<String,Integer> result = new LinkedHashMap<>();
        string = string.replaceAll("[^a-zA-Zа-яА-Я ]", "");
        String[] parts = string.split("\\s+");
        for (int i = 0; i < parts.length; i++) {
            Integer count = result.get(parts[i]);
            if (count == null) {
                result.put(parts[i],1 );
            }
            else {result.put(parts[i], count+1);}
        }

        return result;
    }

    public Map<Character, Integer> characterFrequency(String text) {
        Map<Character,Integer> result = new HashMap<>();
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            Integer count = result.get(characters[i]);
            if (count == null) {
                result.put(characters[i],1 );
            }
            else {result.put(characters[i], count+1);}
        }
        return result;
    }
}
