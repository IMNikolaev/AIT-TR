package lesson_30;

public class Main {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println("Average temperature in " + season + ": " + season.getAverageTemperature() + "°C");
        }
    }
}
