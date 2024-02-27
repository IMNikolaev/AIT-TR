package lesson_30;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    public int getAverageTemperature() {
        switch (this) {
            case WINTER:
                return (WeatherPerMonth.January.getTempPerMonth() + WeatherPerMonth.February.getTempPerMonth() + WeatherPerMonth.December.getTempPerMonth()) / 3;
            case SPRING:
                return (WeatherPerMonth.March.getTempPerMonth() + WeatherPerMonth.April.getTempPerMonth() + WeatherPerMonth.May.getTempPerMonth()) / 3;
            case SUMMER:
                return (WeatherPerMonth.June.getTempPerMonth() + WeatherPerMonth.July.getTempPerMonth() + WeatherPerMonth.August.getTempPerMonth()) / 3;
            case AUTUMN:
                return (WeatherPerMonth.September.getTempPerMonth() + WeatherPerMonth.October.getTempPerMonth() + WeatherPerMonth.November.getTempPerMonth()) / 3;
            default:
                return 0;
        }
    }
}