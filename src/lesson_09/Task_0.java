package lesson_09;




public class Task_0 {


    public static void printArray(int[] arr) {
        System.out.print("Массив в обратной последовательности: ");
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void printArray(int[] arr, int id) {
        System.out.print("Часть массива слева до "+ id + " распечатывается в обычном порядке, а начиная с этого индекса в обратном: ");

        for (int i = 0; i < id; i++) {
            System.out.print(arr[i]);
        }
        for (int i = arr.length-1; i >= id; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void printArray(int[] arr,boolean fl) {
        if (fl==true){
        System.out.print("Массив в обратной последовательности: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
            System.out.println();
        }
        else {
            System.out.print("Массив в обычном порядке: ");

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};
        boolean flag = false;
        int index = 2;
        printArray(array);
        printArray(array, index);
        printArray(array, flag);
    }

}
