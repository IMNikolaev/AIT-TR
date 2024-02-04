package lesson_11;

public class Task_2 {
    public static void main(String[] args) {
        int [] ints = {1,7, 11, 13, 17, 2, 3, 5, 6, 7, 8, 9, 0};
        int counts= countPrimeInArray(ints);
        int[] result = primeNumbersArray(ints, counts);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static boolean isPrime (int number){
        if (number <=1) {return false;}
        if (number <=3) {return true;}
        if (number % 2 == 0 || number % 3 == 0) {return false;}
        for (int i=5; i< Math.sqrt(number); i+=6){
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }
        return true;
    }
    public static int countPrimeInArray (int [] numbers){
        int countisPrime = 0;
        for (int i = 0; i<numbers.length; i++){
            if (isPrime(numbers[i])) {
                countisPrime++;
            }
        }
        return countisPrime;
    }
    public static int[] primeNumbersArray (int [] numbers, int countPrime){
        int [] primeNumbersArray = new int[countPrime];
        int j = 0;
        for (int i = 0; i<numbers.length; i++){
            if (isPrime(numbers[i])) {
                primeNumbersArray[j] = numbers[i];
                j++;
            }
        }
        return primeNumbersArray;
    }
}
