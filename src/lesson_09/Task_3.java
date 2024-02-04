package lesson_09;

public class Task_3 {

    public static void sortAndSearch(int[] arr1, int[] arr2,int num){
        int[] newArr = new int[(arr1.length)+(arr2.length)];
        int j=0;
        int k=0;
        for (int i=0; i< newArr.length; i++){
            if (j < arr1.length && (k >= arr2.length || arr1[j] < arr2[k])){
                newArr[i]= arr1[j];
                if (j< arr1.length){j++;}

            }
            else {
                newArr[i]= arr2[k];
                if (k< arr2.length){k++;}
            }
        }
        System.out.print("Объединенный отсортированный массив : ");
        for (int l=0; l< newArr.length; l++){
            System.out.print(newArr[l]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Искомое число: " + newArr[num-1]);
    }


    public static void main(String[] args) {
        int [] array1 = {100, 112, 256, 349, 770};
        int [] array2 = {72, 86, 113, 119, 265, 445, 892};
        int number = 7;
        if (number < array1.length + array2.length) {
            sortAndSearch(array1,array2,number);
        }
        else {
            System.out.println("Искомый элемент больше длинны массива");
        }

    }
}
