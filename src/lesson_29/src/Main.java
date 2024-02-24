package lesson_29.src;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("100");
        linkedList.add("1000");
        linkedList.addFirst(1);
        System.out.println(linkedList.toString());
        linkedList.remove("100");
        System.out.println(linkedList.toString());


    }
}
