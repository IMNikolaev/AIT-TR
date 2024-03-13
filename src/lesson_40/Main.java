package lesson_40;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // TASK 1
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 0);
        System.out.println(task1(integers));

        // TASK 2
        String string = "Создайте цепочку функций, которая сначала удаляет пробелы из строки, затем преобразует её в верхний регистр, и в конце считает количество символов в измененной строке";
        System.out.println(task2(string));

        // TASK 3

        Map<String,String> FI = new HashMap<>();
        FI.put("Igor", "Nikolaev");
        FI.put("Yaroslav", "Hrytsenko");
        FI.put("Mykhailo", "Chui");

        BiConsumer<String,String> print = (key,value) -> System.out.println(key + " " + value);
        FI.forEach(print);

        // Task 4
        List<String> stringsWithDuplicates = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "pineapple","mango", "blackberry", "kiwi" , "pomegranate",  "watermelon");
        List<String> result = stringsWithDuplicates.stream().filter(string1 -> string1.length()<6).distinct().sorted().collect(Collectors.toList());
        System.out.println(result);

        // TASK 5
        List<Person> personList = getListPersons();
        List<Person> sortedPersonList = personList.stream().filter(person -> person.getAge()>20).filter(person -> person.getCity().equals("Москва")).sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        System.out.println(sortedPersonList);


    }

    // TASK 1
    private static List<Integer> task1 (List<Integer> list){
        List<Integer> result = list.stream().filter(integer -> integer > 10).filter(integer -> integer < 100).filter(integer -> integer%2==0).collect(Collectors.toList());
        return result;
    }


    // TASK 2
    public static int task2(String input) {
        return (int) removeSpaces(input).chars().count();
    }
    private static String removeSpaces (String input) {
        return input.replaceAll("\\s", "").toUpperCase();
    }

    // TASK 5

    private static List<Person> getListPersons() {
        return List.of(
                new Person("Вася", 35, "Москва"),
                new Person("Петя", 27, "Харьков"),
                new Person("Дима", 13, "Донецк"),
                new Person("Саша", 24, "Тюмень"),
                new Person("Игорь", 29, "Москва"),
                new Person("Владимир", 27, "Харьков"),
                new Person("Семен", 12, "Курск"),
                new Person("Алеша", 9, "Москва")
        );
    }


}
