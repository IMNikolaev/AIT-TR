package lesson_38.Task3;

import java.util.*;

public class MetodsTask3 {


    public Character getFirstUniqueChar(String s) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!repeatedChars.contains(c)) {
                if (!uniqueChars.contains(c)) {
                    uniqueChars.add(c);
                } else {
                    uniqueChars.remove(c);
                    repeatedChars.add(c);
                }
            }

        }
        if (uniqueChars.size()>0) {
            return uniqueChars.iterator().next();
        }
        return null;
    }

}
