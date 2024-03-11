package lesson_39.Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Roat {

    public List<String> findRoute (Map map, String cityStart, String cityFinish){
        List<String> route = new ArrayList<>();
        route.add(cityStart);
        String visitedCity;
        visitedCity = cityStart;
        if (!map.containsKey(cityStart)) {
            System.out.println("Стартовый город не существует в карте.");
            return route;
        }
        if (!map.containsValue(cityFinish)){
            System.out.println("Конечный город не существует в карте.");
            return route;
        }
        while (!visitedCity.equals(cityFinish)) {
            String nextCity = (String) map.get(visitedCity);
            route.add(nextCity);
            visitedCity = nextCity;
            if(nextCity.equals(cityStart)){
                return new ArrayList<>();
            }
        }
        return route;
    }
}
