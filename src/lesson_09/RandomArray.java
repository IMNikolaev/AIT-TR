package lesson_09;

import java.util.Random;
/*
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
Посчитайте сколько получилось таких чисел в массиве.
Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
*/
public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = 50;
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = random.nextInt(101);
        }
        System.out.print("Ваш массив : ");
        for (int j=0; j< arrayLength; j++) {
            System.out.print(randomArray[j] + " ");
        }
        System.out.println();
        System.out.print("Простые числа в массиве: ");
        int primeCount = 0; // Счетчик простых чисел

        for (int i = 0; i < arrayLength; i++) {
            int num = randomArray[i];
            if (num > 1) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(num + " ");
                    primeCount++;
                }
            }
        }
        System.out.println();
        System.out.println("Количество простых чисел в массиве: " + primeCount);
    }
}

