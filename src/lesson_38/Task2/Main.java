package lesson_38.Task2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));
        MetodsTask2 metodsTask2 = new MetodsTask2();
        System.out.println(metodsTask2.union(set1, set2));
        System.out.println(metodsTask2.intersection(set1, set2));
        System.out.println(metodsTask2.difference(set1, set2));
        System.out.println(metodsTask2.difference(set2, set1));
    }
}
