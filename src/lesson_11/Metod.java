package lesson_11;

public class Metod {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        System.out.println("Площадь Квардрата = " + ploshad(i));
        System.out.println("Площадь Прямоугольника = " + ploshad(i,j));
    }

    public static int ploshad(int i){
        i = i * i;
        return i;
    }
    public static int ploshad(int i, int j){
        i = i * j;
        return i;
    }
}
