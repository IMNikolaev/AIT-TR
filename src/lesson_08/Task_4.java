package lesson_08;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Input your number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        Random rn = new Random();
        int [] massiv = new int[number];
        for (int i=0; i<number; i++) {
            massiv[i] = rn.nextInt();
        }
        int min = massiv[0];
        int minId = 0;
        int max = massiv[0];
        int maxId = 0;
        for (int j=0; j < number; j++){
            if (min >= massiv[j]){
                min = massiv[j];
                minId = j;
            }
            if (max <= massiv[j]){
                max = massiv[j];
                maxId = j;
            }
        }
        System.out.println("Before Sorting" + "\n");
        for (int k=0; k<number; k++) {
            System.out.println("Number number " + (k+1) + " = " + massiv[k]);
        }
        massiv [minId] = max;
        massiv [maxId] = min;

        System.out.println("After Sorting" + "\n");
        for (int l=0; l<number; l++) {
            System.out.println("Number number " + (l+1) + " = " + massiv[l]);
        }
    }
}
