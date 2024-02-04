package lesson_08;

import java.util.Random;
import java.util.Scanner;

public class Task_3 {
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
        int max = massiv[0];
        int sum=0;
        for (int j=0; j < number; j++){
            if (min >= massiv[j]){
                min = massiv[j];
            }
            if (max <= massiv[j]){
                max = massiv[j];
            }
            sum += massiv[j];
        }
        for (int k=0; k<number; k++) {
            System.out.println("Number number " + (k+1) + " = " + massiv[k]);
        }
        System.out.println("Minimal number = " + min);
        System.out.println("Maximal number = " + max);
        System.out.println("Arithmetic mean = " + (sum/number));
    }
}
