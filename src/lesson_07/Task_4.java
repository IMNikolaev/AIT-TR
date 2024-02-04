package lesson_07;

public class Task_4 {
    public static void main(String[] args) {
        //Task 4
        int howMany = 7;
        int how= 0;
        int a=1;
        int countOfNumbers= 100;
        while ((how < howMany) & (a<=countOfNumbers)){
            if ((a%5) == 0) {
                System.out.println(a);
                how++;
            }
            a++;
        }
    }
}
