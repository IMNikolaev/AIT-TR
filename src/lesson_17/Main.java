package lesson_17;

public class Main {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        ra.add(1);//0
        ra.add(2);//1
        ra.add(3);//2
        ra.add(4);//3
        ra.add(5);//4
        ra.remove(2);
        System.out.println(ra.toString()); // Ошибка
    }
}
