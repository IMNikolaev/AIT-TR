package lesson_36;

import java.util.Comparator;

public class IntsComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return a-b;
    }
}
