package lesson_30;

public enum WeatherPerMonth {

    January("Январь", -6),
    February ("Февраль", -4),
    March ("Март", 1),
    April ("Апрель", 10),
    May ("Май", 17),
    June ("Июнь", 22),
    July ("Июль", 24),
    August ("Август", 24),
    September ("Сентябрь", 17),
    October  ("Октябрь", 9),
    November ("Ноябрь", 1),
    December  ("Декабрь", -3);

    private final String russian;
    private int tempPerMonth;

    WeatherPerMonth(String russian, int tempPerMonth) {
        this.russian = russian;
        this.tempPerMonth = tempPerMonth;
    }

    public String getRussian() {
        return russian;
    }

    public int getTempPerMonth() {
        return tempPerMonth;
    }
}
