package lesson_09;

import java.util.ArrayList;
import java.util.Random;

public class RArray {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = 50;
        int maxNumber = 100;
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = random.nextInt(maxNumber+1);
            }
            System.out.print("Ваш массив : ");
            for (int j = 0; j < arrayLength; j++) {
                System.out.print(randomArray[j] + " ");
            }
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeList.add(i);
            }
        }
        int count = 0;
        for (int i = 0; i < randomArray.length; i++) {
            int num = randomArray[i];
            if (primeList.contains(num)) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество простых чисел = " + count);
    }
}
