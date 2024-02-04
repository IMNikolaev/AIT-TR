package lesson_07;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        //Task 5
        int i=0;
        while (true) {
            System.out.println("Введите \"hello\"");
            Scanner scan = new Scanner(System.in);
            String string = scan.next();
            i++;
            if (string.equals("hello")){
                break;
            }
        }
        System.out.println("Затрачено попыток: " + i);
    }
}
