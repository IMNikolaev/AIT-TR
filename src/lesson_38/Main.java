package lesson_38;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(1);
        list.add(754);
        list.add(2);
        list.add(3232);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(1);

        MetodsSet metodsSet = new MetodsSet();
        System.out.println(metodsSet.getUniqueElements(list));
        System.out.println(metodsSet.getUniqueSortedElements(list));
    }
}
