package lesson_37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        ListMetods listMetods = new ListMetods();
        long arrayListTime;
        long linkedListTime;
        long arrayListFullTime = 0;
        long linkedListFullTime= 0;


        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(listMetods.MyRetainAll(arrayList, linkedList));

        arrayList.clear();
        linkedList.clear();

        arrayListTime = listMetods.addFiveThousand(arrayList);
        linkedListTime = listMetods.addFiveThousand(linkedList);


        System.out.println("Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.");
        listMetods.printComparison(arrayListTime,linkedListTime);
        System.out.println();
        System.out.println("-----------------------------------");

        arrayListTime = listMetods.getAll(arrayList);
        linkedListTime = listMetods.getAll(linkedList);


        System.out.println("Получение всех значений элементов списка по его индексу");
        listMetods.printComparison(arrayListTime,linkedListTime);
        System.out.println();
        System.out.println("-----------------------------------");


        arrayListTime = listMetods.addTwoThousandAtRandomPlace(arrayList);
        linkedListTime = listMetods.addTwoThousandAtRandomPlace(linkedList);


        System.out.println("Вставка 2_000 новых значений по случайному индексу");
        listMetods.printComparison(arrayListTime,linkedListTime);
        System.out.println();
        System.out.println("-----------------------------------");

        arrayListTime = listMetods.randomIndexRemoveOneThousand(arrayList);
        linkedListTime = listMetods.randomIndexRemoveOneThousand(linkedList);


        System.out.println("Удалить 1_000 элементов по случайному индексу");
        listMetods.printComparison(arrayListTime,linkedListTime);
        System.out.println();
        System.out.println("-----------------------------------");

        arrayListTime = listMetods.randomNumberRemoveOneThousand(arrayList);
        linkedListTime = listMetods.randomNumberRemoveOneThousand(linkedList);


        System.out.println("Удалить 1_000 элементов по значению");
        listMetods.printComparison(arrayListTime,linkedListTime);
        System.out.println();
        System.out.println("-----------------------------------");

        arrayList.clear();
        linkedList.clear();

        arrayListFullTime += listMetods.addFiveThousand(arrayList);
        arrayListFullTime += listMetods.getAll(arrayList);
        arrayListFullTime += listMetods.addTwoThousandAtRandomPlace(arrayList);
        arrayListFullTime += listMetods.randomIndexRemoveOneThousand(arrayList);
        arrayListFullTime += listMetods.randomNumberRemoveOneThousand(arrayList);

        linkedListFullTime += listMetods.addFiveThousand(linkedList);
        linkedListFullTime += listMetods.getAll(linkedList);
        linkedListFullTime += listMetods.addTwoThousandAtRandomPlace(linkedList);
        linkedListFullTime += listMetods.randomIndexRemoveOneThousand(linkedList);
        linkedListFullTime += listMetods.randomNumberRemoveOneThousand(linkedList);
        System.out.println("Cравните время последовательного выполнения всех методов");
        listMetods.printComparison(arrayListFullTime,linkedListFullTime);


    }
}
