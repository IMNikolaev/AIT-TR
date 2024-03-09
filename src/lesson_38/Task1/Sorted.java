package lesson_38.Task1;

import java.util.*;

public class Sorted {
    public ArrayList<String> stringToArray (String s){
        s= s.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] parts = s.split("\\s+");
        ArrayList<String> result = new ArrayList<>(List.of(parts));
        return result;
    }

    public ArrayList<String> sort (ArrayList arrayList){
        arrayList.sort(Comparator.comparingInt(String::length));
        Set<String> mySet = new LinkedHashSet<String>(arrayList);
        return new ArrayList<>(mySet);
    }
}
