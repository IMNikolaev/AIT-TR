package lesson_19;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.increment();
        counter1.increment();
        counter1.decrement();
        System.out.println(counter1.getValue());
    }
}
