package lesson_08;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Input your number");
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        int sum=0;
       if (number.matches("\\d+")) {
           for (int i=0; i< number.length(); i++){
                sum = sum + (number.charAt(i) - 48);
           }
           System.out.println("The sum of the digits of your number: " + sum);
       }
    }
}
