package lesson_25;

import java.util.Arrays;

public class RubberArrayV2<T> implements MyList<T>{


    private T[] array;
    private int indicator;

    public RubberArrayV2(T[] array) {
        this.array = (T[]) new Object [array.length];
        for (int i=0; i< array.length; i++){
            this.array[i] = array[i];
            indicator++;
        }
    }

    public RubberArrayV2() {
        this.array = (T[]) new Object[10];
    }

    private void expandArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < indicator; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public void add(T value) {
        if (indicator > array.length * 0.9) {
            expandArray();
        }
        array[indicator] = value;
        indicator++;
    }


    @Override
    public void addAll(T... values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    @Override
    public int size() {
        return indicator;
    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < indicator; i++) {
            if (array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = indicator-1; i >=0; i--) {
            if (array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < indicator; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[indicator];
        for (int i = 0; i < indicator; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Override
    public boolean remove(T value) {
        for (int i = 0; i < indicator; i++) {
            if (array[i] == value) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index>=indicator) return null;
        T forReturn = array[index];
        for (int i = index; i < indicator -1; i++) {
            array[i] = array[i+1];
        }
        indicator--;
        return forReturn;
    }

    @Override
    public boolean isEmpty() {
        return indicator==0;
    }

    @Override
    public T get(int index) {
        if (index< indicator){
            return array[index];
        }
        else {
            System.out.println("Index > Array length");
            return null;
        }
    }

    @Override
    public void set(int index, T value) {
        array[index] = value;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, indicator));
    }
}

