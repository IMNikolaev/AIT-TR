package lesson_08;

import java.util.Random;

public class Lesson {
    public static void main(String[] args) {
        int[] name = new int[100];
        Random random = new Random();
        for (int i= 0; i< name.length; i++){
            name[i] = random.nextInt(100) + 1;
        }
        int min = name[0];
        for (int j=0; j<name.length; j++){
            System.out.println("Число " + (j+1) + " " + name[j]);
            if (name [j] < min) {
                min = name[j];
            }
        }
        System.out.println(min);
    }
}
