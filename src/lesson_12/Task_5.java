package lesson_12;

public class Task_5 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8};
        System.out.println(sumOfArray(ints));
    }
    public static int sumOfArray (int[] ints){
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum+= ints[i];
        }
        return sum;
    }

}

