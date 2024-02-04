package lesson_03;

public class Main {
    public static void main(String[] args) {
        // 1
        int size = 10;

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }

        int sum = 0;
        for (int i=0; i< size; i++) {
            sum += numbers[i];
        }
        int result1 = sum / size;
        System.out.println("Задание 1: Среднее арифметическое: " +result1);

        double result2 = (double) sum / (double)size;
        System.out.println("Задание 1: Среднее арифметическое с дробной частью : " + result2);

        System.out.println("Задание 1: Разница " + Math.abs((double)result1-result2)+ "\n");


        // 2

        int GoodsOne = 100;
        int GoodsTwo = 50;
        int Discount = 10;

        System.out.println("Задание 2: Цена до скидки: " + (GoodsOne+GoodsTwo));
        System.out.println("Задание 2: Цена со скидкой: " + ((GoodsOne+GoodsTwo) - ((GoodsOne+GoodsTwo)*Discount/100)) + "\n");

        // 3

        int Thursday = -8;
        int Friday = -3;
        int Saturday = -5;
        int Sunday = -8;
        int Monday = -9;
        int Tuesday = -2;
        int Wednesday = 0;

        int AverageTemperature = (Thursday + Friday + Saturday + Sunday + Monday + Tuesday + Wednesday)/7;
        System.out.println( "Задание 3: " + AverageTemperature+ "\n");


        // 4

        int num1 = 5;
        int remainderModulo2 = num1 % 2;
        System.out.println("Задание 4: (Остаток от деления на 2) " + num1 + " % 2 = " + remainderModulo2);
        int num2 = 5;
        int remainderModulo3 = num2 % 3;
        System.out.println("Задание 4: (Остаток от деления на 3) " + num2 + " % 3 = " + remainderModulo3+ "\n");


        // 5

        int x = 3;
        x += x++;
        System.out.println("Задание 5: " + x);
    }
}
