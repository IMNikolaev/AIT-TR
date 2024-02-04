package lesson_09;

import java.util.Scanner;

public class Task_1 {

    public static void degree (int num){
        double result = 2;
        System.out.print("Два в степени " + num + " = ");
        if (num == 0) {
            result=1;
        } else if (num>0) {
            for (int i = 0; i< num-1; i++){
                result *= 2;
            }
        }
        else {
            for (int i = 0; i< -num -1; i++){
                result *= 2;
            }
            result = 1.0 / result;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("Введите число в степень которую нужно возвести двойку: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        degree(number);
    }
}
