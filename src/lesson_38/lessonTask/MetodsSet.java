package lesson_38.lessonTask;

import java.util.*;

public class MetodsSet {

    public <T> List<T> getUniqueElements(List<T> list) {
        Set<T> mySet = new HashSet<>(list);
        return new ArrayList<>(mySet);
    }

    public <T> List<T> getUniqueSortedElements(List<T> list) {
        Set<T> mySet = (Set<T>) new TreeSet<>(Comparator.reverseOrder());
        mySet.addAll(list);
        return new ArrayList<>(mySet);
    }
}
