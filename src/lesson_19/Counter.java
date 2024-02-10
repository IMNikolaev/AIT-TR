package lesson_19;

public class Counter {
    private int value;

    public Counter() {
        this.value=0;
    }
    public void increment(){
        value++;
    }
    public void decrement(){
        value--;
    }

    public int getValue() {
        return this.value;
    }
}
