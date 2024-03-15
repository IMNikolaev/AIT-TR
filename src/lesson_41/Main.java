package lesson_41;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // TAKS 1
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, 15, 24, 0, 16,11, 1001);
        List<Integer> task1 = integers.stream().filter(integer -> integer>10).sorted(Comparator.comparing(integer -> integer%10)).collect(Collectors.toList());
        System.out.println(task1);

        // TASK 2

        List<String> list = List.of("Вода", "Водка", "Вилы", "Вилка", "Вино", "Вода", "Водка", "Вилы", "Вилка", "Аджика", "Сало");
        //String task2 = list.stream().filter(Objects::nonNull).max(Comparator.comparing(string -> string.length())).toString();
        Optional<String> longestString = list.stream().filter(Objects::nonNull).max(Comparator.comparing(string -> string.length()));
        String task2 = longestString.orElse("Список пуст");
        System.out.println(task2);

        // TASK 3

        List<Integer> integers1 = List.of(-1, 12, 0, 4, 1, 15, 24, 0, 16,11, 1001);
        List<Integer>task3 = integers1.stream().filter(integer -> integer%2==0).map(integer -> integer= integer*2).collect(Collectors.toList());
        System.out.println(task3);

        String[] strings = {"Abcd","bbbb","string","hello","world"};
        int[]ints = Arrays.stream(strings)
                .mapToInt(i -> i.length())
                .toArray();
        System.out.println(Arrays.toString(ints));


     }
}
