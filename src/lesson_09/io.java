package lesson_09;

import java.util.Scanner;

public class io {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Запускаем Сканер
        System.out.println("Введите число к которому нужно прибавить два!"); // Выводим ТЕКСТ
        int number = scan.nextInt(); //Считываем число
        plusTwo(number, number); // Вызываем метод с названием  plusTwo и передаем ему значение number
    }

    public static void plusTwo(int num1, int num2){
        num1= num1 + 2; // Прибавили к полученому числу 2
        System.out.println("2 + " + num2 + " = " + num1); // Вывели

    }
}
