package lesson_16;

public class RubberArray {
int [] array;
int indicator;


    public RubberArray(int[] intsArray) {
        array = new int[intsArray.length];
        for (int i = 0; i < intsArray.length; i++) {
            array[i] = intsArray[i];
            indicator++;
        }
    }
    public RubberArray() {
        array = new int[10];
    }
    void add(int number) {

        if (indicator > array.length * 0.9) {
            expandArray();
        }

        array[indicator] = number;
        indicator++;
    }
    void add(int... ints) {
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }
    void expandArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < indicator; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        if (indicator == 0) return "[]";
        String result = "[";
        for (int i = 0; i < indicator; i++) {
            result += array[i] + ((i < indicator - 1) ? ", " : "]");
        }
        return result;
    }
    public int indexOf (String num){
        int number = Integer.parseInt(num);
        int index =-1;
        for (int i = 0; i < indicator; i++) {
            if (array[i] == number){
                index = i;
            }
        }
        return index;
    }
    public int get (int index){
        if (index< indicator){
            return array[index];
        }
        else {
            System.out.println("Index > Array length");
            return -1;
        }
    }
    public int size (){
        return indicator;
    }
    public void remove (int index){
        if (index>=indicator) return;
        int[] newArray = new int[indicator-1];
        int j=0;
        for (int i = 0; i < indicator; i++) {
            if (i!=index){
                newArray[j]= array[i];
                j++;
            }
        }
        array = newArray;
        indicator--;
    }
    public void remove (String num){
        int number = Integer.parseInt(num);
        for (int i = 0; i < indicator; i++) {
            if (array[i] == number){
                remove(i);
            }
        }
    }
    public void set (int index, String num){
        int number = Integer.parseInt(num);
        array[index] = number;
    }
    public void set (String old, String fresh){
        if (indexOf(old) !=-1)
        set(indexOf(old),fresh);
        else {return;}
    }
}