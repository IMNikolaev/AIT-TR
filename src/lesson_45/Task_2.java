package lesson_45;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Map<String, LocalDate> warMap = new HashMap<>();

        // Добавление войн в Map
        warMap.put("Первая мировая война", LocalDate.of(1914, 7, 28));
        warMap.put("Вторая мировая война", LocalDate.of(1939, 9, 1));
        warMap.put("Война во Вьетнаме", LocalDate.of(1955, 11, 1));
        warMap.put("Гражданская война в США", LocalDate.of(1861, 4, 12));
        warMap.put("Война в Ираке", LocalDate.of(2003, 3, 20));

        //Написать метод, принимающий список из нескольких дат типа LocalDate
        //и возвращающий количество дней между самой ранней и поздней датами в этом списке

        BiggestDatesBetweenTheWars biggestDatesBetweenTheWars = new BiggestDatesBetweenTheWars();
        System.out.println(biggestDatesBetweenTheWars.findDaysBetween(warMap) + " дней прошло между " + biggestDatesBetweenTheWars.getMinDateName()+ " и " + biggestDatesBetweenTheWars.getMaxDateName());
    }
}
