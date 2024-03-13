package Test;

import HashMap.MyHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> hM = new MyHashMap<String, Integer>();
        Map<String,Integer> hMtrue = new HashMap<>();
        hM.put("Груша",12);
        hM.put("Яблоко",1);
        hM.put("Арбуз",18);

        hMtrue.put("Груша",12);
        hMtrue.put("Яблоко",1);
        hMtrue.put("Арбуз",18);

        System.out.println(hM);
        System.out.println(hMtrue);
        System.out.println(hM.values());
        System.out.println(hMtrue.values());
        System.out.println(hM.containsKey("Груша"));
        System.out.println(hMtrue.containsKey("Груша"));

    }
}

