package lesson_10;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        int[] ints = new int[10];

    }
    public static void fillArray (int[] ints){
        Random random = new Random();
        for (int i=0; i< ints.length;i++){
            ints[i]=random.nextInt(1000);
        }
    }
}
