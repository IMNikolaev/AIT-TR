package lesson_45;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;

public class BiggestDatesBetweenTheWars {
    public LocalDate getMinDate() {
        return minDate;
    }

    public LocalDate getMaxDate() {
        return maxDate;
    }

    private LocalDate minDate = null;
    private LocalDate maxDate = null;

    public String getMinDateName() {
        return minDateName;
    }

    public String getMaxDateName() {
        return maxDateName;
    }

    private String minDateName = null;
    private String maxDateName = null;
    public long findDaysBetween(Map<String, LocalDate> warMap) {
        minDate = warMap.values().stream().min(LocalDate::compareTo).orElse(null);
        maxDate = warMap.values().stream().max(LocalDate::compareTo).orElse(null);

        if (minDate != null && maxDate != null) {
            getLatestWar(warMap);
            getEarliestWar(warMap);
            return ChronoUnit.DAYS.between(minDate, maxDate);
        } else {
            return 0;
        }
    }
    private void getEarliestWar(Map<String, LocalDate> warMap) {
        LocalDate earliestDate = warMap.values().stream().min(LocalDate::compareTo).orElseThrow();
        minDateName = warMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(earliestDate))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
    }
    private void getLatestWar(Map<String, LocalDate> warMap) {
        LocalDate earliestDate = warMap.values().stream().max(LocalDate::compareTo).orElseThrow();
        maxDateName = warMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(earliestDate))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
    }
}
