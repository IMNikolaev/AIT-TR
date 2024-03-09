package lesson_38.Task1;

import java.util.*;

public class Sorted {

    public ArrayList<String> getUniqueSortedWords(String s) {
        s = s.replaceAll("[^a-zA-Zа-яА-Я ]", "");
        String[] parts = s.split("\\s+");
        Set<String> wordsSet = new TreeSet<>(Comparator
                .comparingInt(String::length)
                .thenComparing(String::compareTo));
        wordsSet.addAll(Arrays.asList(parts));
        return new ArrayList<>(wordsSet);
    }
}
