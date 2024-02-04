package lesson_12;

public class Task_1 {
    public static void main(String[] args) {
        int [] testIntArray = {0, 1, 2, 3, 4, 5, 6};
        int[] result = swap(testIntArray, 1, 5);
        for (int i=0; i< result.length;i++){
            System.out.print(result[i]);
        }
    }
    public static int [] swap (int [] arr, int firstIndex, int lastIndex){
        int  swapIndex = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = swapIndex;
        return arr;
    }
}
