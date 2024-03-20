package lesson_45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task_1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата: " + date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());

        LocalDate myBirthday= LocalDate.of(1994,07,26);
        System.out.println(myBirthday);

        System.out.println(date.equals(myBirthday));

        LocalTime time =LocalTime.now();
        System.out.println(time);
        System.out.println(time.plusHours(3));

        LocalDate nextWeek = date.plusWeeks(1);
        LocalDate beforeYear = date.minus(1, ChronoUnit.YEARS); //которая была на год раньше сегодняшней используя метод minus (Именно minus так именно minus)
        LocalDate nextYear = date.plusYears(1);
        LocalDate tomorrow = date.plusDays(1);
        LocalDate yesterday = date.minusDays(1);

        System.out.println(date.isAfter(tomorrow));
        System.out.println(date.isBefore(tomorrow));
        System.out.println(date.isAfter(yesterday));
        System.out.println(date.isBefore(yesterday));
    }
}
