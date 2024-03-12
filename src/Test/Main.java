package Test;

import HashMap.MyHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> hM = new MyHashMap<String, Integer>();
        hM.put("Груша",12);
        hM.put("Яблоко",13);
        hM.put("Яблоко",1);
        hM.put("Арбуз",12);
        System.out.println(hM);
        System.out.println(hM.get("Арбуз"));
        System.out.println(hM.remove("Арбуз"));
        System.out.println(hM);
    }
}

