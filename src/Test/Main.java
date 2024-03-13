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
        System.out.println(hMtrue.isEmpty());
        System.out.println(hM.isEmpty());
        System.out.println(hM.size());

        hM.put("Груша1",12);
        hM.put("Яблоко2",1);
        hM.put("Арбуз3",18);
        hM.put("Груша4",12);
        hM.put("Яблоко6",1);
        hM.put("Арбуз6",18);
        hM.put("Груша4",12);
        hM.put("Яблоко12",1);
        hM.put("Арбуз12321",18);
        hM.put("Груша123",12);
        hM.put("Яблоко2123",1);
        hM.put("Арбуз12321",18);
        hM.put("Груша12321321",12);
        hM.put("Яблоко213213",1);
        hM.put("Арбуз121",18);
        hM.put("Груша111",12);
        hM.put("Яблоко2222",1);
        hM.put("Арбуз33333",18);
        hM.put("Груша555",12);
        hM.put("Яблоко666",1);
        hM.put("Арбуз7777",18);

        System.out.println(hM);


    }
}

