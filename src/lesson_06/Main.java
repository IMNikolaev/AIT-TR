package lesson_06;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 0
        System.out.println("Введите 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        String yourNumber = scanner.next();
        int yourRealNumber;

        if (yourNumber.equals("1") || yourNumber.equals("2") || yourNumber.equals("3")) {
            yourRealNumber = Integer.parseInt(yourNumber);
            System.out.println("Вы ввели: " + yourRealNumber);
        } else {
            System.out.println("Неверный ввод!");
        }




        // Task 1
        Random rn = new Random();
        int count = 4;
        int result = 0;
        for (int i = 1; i <= count; i++){
            int randomNumber = rn.nextInt(100) + 1;
            System.out.println("Число " + i + ": "+ randomNumber);
            if (result < randomNumber){
                result = randomNumber;
            }
        }
        System.out.println("Самое большое число: " + result + "\n");

        System.out.println("Введите четырехзначное число");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        if ((number.length() == 4) && number.matches("\\d+")) {
            if ((int)number.charAt(0) + (int)number.charAt(1) == (int)number.charAt(2) + (int)number.charAt(3)) {
                System.out.println("Число счастливое");
            }
            else{
                System.out.println("Число НЕ является счастливым");
            }
            }
        else {
            System.out.println("Ошибка!");
        }
        }

    }

