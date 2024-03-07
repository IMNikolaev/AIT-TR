package lesson_37;

import java.util.List;
import java.util.Random;

public class ListMetods {

    public List<Integer> MyRetainAll (List list1, List list2){
        List list3 = list1;
        list3.retainAll(list2);
        return list3;
    }

    public long addFiveThousand (List list) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i <5000 ; i++) {
            list.add(random.nextInt(1000)+1);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long getAll (List list){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long addTwoThousandAtRandomPlace (List list){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            Random random = new Random();
            list.add(random.nextInt(list.size()),random.nextInt(1000)+1);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long randomIndexRemoveOneThousand (List list){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            list.remove(random.nextInt(list.size()));
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public long randomNumberRemoveOneThousand(List list){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            list.remove(Integer.valueOf(random.nextInt(10000)+1));
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


    public void printComparison (long arraylistTime, long linkedListTime){
        if (arraylistTime>linkedListTime){
            System.out.println("LinkedList быстрее чем ArrayList на " + (arraylistTime-linkedListTime) + " миллисекунд");
        }
        else if (arraylistTime<linkedListTime){
            System.out.println("ArrayList быстрее чем LinkedList на " + (linkedListTime-arraylistTime) + " миллисекунды");
        }
        else System.out.println("Это невозможно! Но время выполнения одинаково!");
    }



}
