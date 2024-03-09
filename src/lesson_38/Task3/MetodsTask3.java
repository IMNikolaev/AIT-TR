package lesson_38.Task3;

import java.util.*;

public class MetodsTask3 {

    public Character getFirstUniqueChar(String string) {
        String[] parts = string.split("");
        ArrayList<String> symbolsArray = new ArrayList<>(List.of(parts));
        int [] counts = new int[symbolsArray.size()];
        for (int i = 0; i < symbolsArray.size(); i++) {
            for (int j = i+1; j < symbolsArray.size(); j++) {
                if (symbolsArray.get(i).equals(symbolsArray.get(j))){
                    counts[i] +=1;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i]==0){
                return symbolsArray.get(i).charAt(0);
            }
        }
        return null;
    }

}
