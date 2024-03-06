package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class IntsComparable {

    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a%2 == 0 && b%2!=0){
                    return -1;
                }
                else if (a%2!=0 && b%2==0){
                    return 1;
                }
                return a.compareTo(b);
            }
        });
        System.out.println(Arrays.toString(integers));

        // ВАРИАНТ 1
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a%2 == 0 && b%2!=0){
                    return -1;
                }
                else if (a%2!=0 && b%2==0){
                    return 1;
                }
                if (a%2!=0 && b%2!=0) {
                    return b.compareTo(a);
                }
                return a.compareTo(b);
            }
        });
        System.out.println(Arrays.toString(integers));

        // ВАРИАНТ 2
        Comparator<Integer> ins = (a,b) -> {
            if (a%2 == 0 && b%2!=0){
                return -1;
            }
            else if (a%2!=0 && b%2==0){
                return 1;
            }
            if (a%2!=0 && b%2!=0) {
                return b.compareTo(a);
            }
            return a.compareTo(b);
        };
        Arrays.sort(integers,ins);
        System.out.println(Arrays.toString(integers));
    }
}
