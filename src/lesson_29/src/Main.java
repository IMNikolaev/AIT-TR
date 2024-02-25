package lesson_29.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyLinkedList  <String>linkedList = new MyLinkedList();
        linkedList.remove("1");
        linkedList.add("1");
        linkedList.add("100");
        System.out.println(linkedList.toString());
        linkedList.remove("100");
        System.out.println(linkedList.toString());
        linkedList.add("1000");
        System.out.println(linkedList.toString());
        System.out.println(linkedList.toString());
        String[] array = new String[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            array[i] = linkedList.get(i);
        }
        for (String element : array) {
            System.out.println(element);
        }


    }
}

