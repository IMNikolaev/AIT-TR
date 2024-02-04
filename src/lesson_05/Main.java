package lesson_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int random = sc.nextInt();
                System.out.println("Задание 4");

                String result = (random == 0) ?
                        "Число равно 0\n" :
                        "Число: " + random + " четное: " + ((random % 2) == 0) +
                                "; кратно 3: " + ((random % 3) == 0) +
                                "; четное и кратное 3 :" + (((random % 2) == 0) & ((random % 3) == 0)) + "\n";

                System.out.println(result);
                Runtime.getRuntime().exit(0);
            }
        }