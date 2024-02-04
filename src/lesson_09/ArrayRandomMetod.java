package lesson_09;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayRandomMetod {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = 50;
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = random.nextInt(101);
        }
        System.out.print("Ваш массив : ");
        for (int j = 0; j < arrayLength; j++) {
            System.out.print(randomArray[j] + " ");
        }
        int primeCount = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (isPrime(randomArray[i])) {
                primeCount++;
            }
        }
        System.out.println();
        System.out.println("Количество простых чисел = " + primeCount);
    }
    public static boolean isPrime (int number){
        return IntStream. rangeClosed(2, (int) (Math. sqrt (number)))
                .allMatch(n -> number % n != 0);
    }
}
