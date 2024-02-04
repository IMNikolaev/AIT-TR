package lesson_09;

public class Task_2 {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4 , 5, 6};
        int len = 10;
        copyOfArray(array, len);
    }
    public static void copyOfArray(int[] arr, int length){
        System.out.print("Новый массив до " + length + " элемента : ");
        int[] newArray =  new int[length];
        for (int i = 0; i < length && i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        for (int i=0; i<length;i++){
            System.out.print(newArray[i]);;
        }

    }
}
