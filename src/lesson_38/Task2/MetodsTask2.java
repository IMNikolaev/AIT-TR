package lesson_38.Task2;

import java.util.HashSet;
import java.util.Set;

public class MetodsTask2 {
    public <T> Set<T> intersection (Set set1, Set set2){
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }
    public <T> Set<T> difference (Set set1, Set set2){
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.removeAll(set2);
        return resultSet;
    }

    public <T> Set<T> union (Set set1, Set set2){
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

}
