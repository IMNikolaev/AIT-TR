package lesson_07;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int note = random.nextInt(5)+1;
        int monney = 100;
        switch (note) {
            case (5):
                monney+= 20;
                System.out.println("Оценка "+ note + "Денег: " + monney);
                break;
            case (4):
                monney+= 10;
                System.out.println("Оценка "+ note + "Денег: " + monney);
                break;
            case (3):
                System.out.println("Оценка "+ note + "Денег: " + monney);
                break;
            case (2):
                monney-= 20;
                System.out.println("Оценка "+ note + "Денег: " + monney);
                break;
            case (1):
                monney = 0;
                System.out.println("Оценка "+ note + "Денег: " + monney);
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }
}
