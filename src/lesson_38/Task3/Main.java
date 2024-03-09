package lesson_38.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        char[] characters = string.toCharArray();
        MetodsTask3 metodsTask3 = new MetodsTask3();
        System.out.println(metodsTask3.getFirstUniqueChar(string));
    }
}
