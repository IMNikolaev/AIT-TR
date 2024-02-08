package lesson_17;

public class Main {
    public static void main(String[] args) {

        RubberArray ra = new RubberArray();

        System.out.println(ra.toString());
        ra.add(1);
        for (int i = 0; i < 10; i++) {
            ra.add(i);
        }
        System.out.println(ra.toString());
        System.out.println(ra.indexOf("2"));
        System.out.println(ra.get(1));
        System.out.println(ra.size());
        ra.remove(0);
        System.out.println(ra.toString());
        ra.remove("8");
        System.out.println(ra.toString());
        ra.set(1,"100");
        System.out.println(ra.toString());
        ra.set("90","100");
        System.out.println(ra.toString());
        int [] intsArray = {1,2,3,4,5};
        RubberArray rabber = new RubberArray(intsArray);
        System.out.println(rabber.toString());
        rabber.add(1);
        rabber.add(12);
        System.out.println(rabber.toString());
    }
}
