package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class IntsComparable {



    public Integer[] firstTaskSort (Integer[] integers) {
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
        return integers;
    }
    public Integer[] secondTaskSortV1 (Integer[] integers) {
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
        return integers;
    }
    public Integer[] secondTaskSortV2 (Integer[] integers) {
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
        return integers;
    }

    public static void main(String[] args) {
        IntsComparable intsComparable = new IntsComparable();
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer [] newIntegers = intsComparable.firstTaskSort(integers);
        System.out.println(Arrays.toString(newIntegers));

        // ВАРИАНТ 1
        Integer [] newIntegers2 = intsComparable.secondTaskSortV1(integers);
        System.out.println(Arrays.toString(newIntegers2));

        // ВАРИАНТ 2
        Integer [] newIntegers3 = intsComparable.secondTaskSortV2(integers);
        System.out.println(Arrays.toString(newIntegers3));
    }
}
