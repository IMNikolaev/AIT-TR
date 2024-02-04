package lesson_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 0
        System.out.println("Введите 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        String yourNumber = scanner.next();
        int yourRealNumber;

        switch (yourNumber) {
            case "1":
            case "2":
            case "3":
                yourRealNumber = Integer.parseInt(yourNumber);
                System.out.println("Вы ввели: " + yourRealNumber);
                break;
            default:
                System.out.println("Неверный ввод!");
        }
        //Task 1
        System.out.println("Число от 1 до 7");
        Scanner sc = new Scanner(System.in);
        String nmbr = sc.next();
        switch (nmbr) {
            case "1":
                System.out.println("Понедельник");
                break;
            case "2":
                System.out.println("Вторник");
                break;
            case "3":
                System.out.println("Среда");
                break;
            case "4":
                System.out.println("Четверг");
                break;
            case "5":
                System.out.println("Пятница");
                break;
            case "6":
                System.out.println("Выходной");
                break;
            case "7":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Неверный ввод!");
        }

        //Task 2
        System.out.println("Число от 1 до 12");
        Scanner scan = new Scanner(System.in);
        int performance = scan.nextInt();
        int time = 45;
        int maxTime = 60;
        int yourTime;
        switch (performance) {
            case (10):
            case (11):
            case (12):
                yourTime = (time + 60);
                System.out.println("Отлично, ты лучший, можешь смотреть телевизор: " + Math.min(yourTime, maxTime) + " Минут");
                break;
            case (7):
            case (8):
            case (9):
                yourTime = (time + 45);
                System.out.println("Молодец, можешь смотреть телевизор: " + Math.min(yourTime, maxTime) + " Минут");
                break;
            case (4):
            case (5):
            case (6):
                yourTime = (time + 15);
                System.out.println("Ну ок, можешь смотреть телевизор: " + Math.min(yourTime, maxTime) + " Минут");
                break;
            case (3):
                yourTime = (time - 30);
                System.out.println("Плохо, можешь смотреть телевизор: " + Math.min(yourTime, maxTime) + " Минут");
                break;
            case (2):
            case (1):
            case (0):
                yourTime = 0;
                System.out.println("Никакого сегодня телевизора: " + yourTime + " Минут");
                break;
            default:
                System.out.println("Неверный ввод!");
        }
        //Task 3
        int count = 10;
        int i = 1;
        while (i <= count){
            System.out.println("Task " + i);
            i++;

        }

    }
}
