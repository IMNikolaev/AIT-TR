package lesson_29.src;

import org.junit.platform.engine.support.hierarchical.Node;

import java.lang.reflect.Array;

public class MyLinkedList<T> implements MyList<T>, MyQueue<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;


    // метод добавление элемент в конец списка
    @Override
    public void add(T value) {
        if (first == null) {
            // Не существует ни одного элемента. Добавляемая нода станет первой и пока единственной
            first = new Node<>(value, null, null);
        } else if (last == null) {
            // существует только один узел first
            // справа от first приклеить новую ноду
            last = new Node<>(value, first, null);
            // нам надо организовать связь "направо" от ноды first
            first.next = last;
        } else {
            // когда существует и first и last объект (обе ссылки не равны null)
            Node<T> temp = last;

            last = new Node<>(value, temp, null);
            temp.next = last;
        }

        size++;
    }

    //Добавить элемент слева
    public void addFirst(T value) {
        if (first == null) {
            // список пустой
            first = new Node<>(value, null, null);
        } else if (last == null) {
            // есть только 1 нода (first)
            last = first;
            first = new Node<>(value, null, last);
            last.previous = first;
        } else {
            // все остальные состояния - у нас 2 или больше узлов
            Node<T> temp = first;
            first = new Node<>(value, null, temp);
            temp.previous = first;

        }

        size++;
    }

    // Удаляем самый первый (левый) элемент;
    public T remove() {
        if (size == 0) return null;

        // если нод больше чем 0, мы должны будем удалить ноду first
        T value = first.value;

        if (size == 1) {
            first = null;
        } else if (size == 2) {
            // у нас только 2 ноды - first и last
            // мы должны сделать last first-ом
            first = last;
            // first = first.next; альтернативный вариант перекинуть ссылку
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }

        size--;
        return value;
    }

    @Override
    public T removeFirst() {
        return remove();
    }

    public T removeLast() {
        if (size == 0) return null;

        T value;

        if (size == 1) {
            // только одна нода. first
            value = first.value;
            first = null;
        } // сценарии в которых мы удаляем ноду last
        else if (size == 2) {
            // есть всего две ноды
            value = last.value;
            last = null;
            first.next = null;
        } else {
            value = last.value;
            last = last.previous;
            last.next = null;
        }

        size--;
        return value;

    }

    @Override
    public void addAll(T... values) {
        for (T value: values) {
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T value) {
        int index = 0;

        // Перебирать мой список, начиная с головы
        // проверять - совпадает ли value в текущем узле с тем, что мы ищем. Если совпадает - вернуть индекс
        // не забыть увеличить мой счетчик индекса,
        // проверить значение в след. элементе, если оно есть

        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }

            index++;
            cursor = cursor.next;
        }

        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
//        if (size == 0) return -1;
        int index = size - 1;

        Node<T> cursor = last;
        // когда есть только нода first - цикл не выполнится ни разу

        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }

            index--;
            cursor = cursor.previous;

        }

        // обработка сценария, когда есть только нода first
        if (first != null &&  first.value.equals(value)) return 0;
        // альтернативная проверка
//        if (size != 0  &&  first.value.equals(value)) return 0;

        return -1;
    }


    @Override
    public boolean contains(T value) {
        if (indexOf(value)!=-1){
            return true;
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray() {

        T[] result = (T[]) Array.newInstance(first.value.getClass(), size);
        int i =0;
        Node<T> cursor = first;
        while (cursor!=null){
            result[i++] = cursor.value;
            cursor= cursor.next;
        }
        return result;
    }
    private void removeNode(Node<T> node) {
        if (node == first){
            remove();
            return;
        }

        if ((node == last)) {
            removeLast();
            return;
        }

        node.previous.next = node.next;
        node.next.previous = node.previous;

        // не обязательно
        node = null;
        size--;

    }
    @Override
    public boolean remove(T value) {
        Node <T> cursor = first;
        if (first == null)
            return false;
        if (first.value.equals(value)){
            removeFirst();
            return true;
        }
        if (last.value.equals(value)){
            removeLast();
            return true;
        }
        while (cursor.next!=null){
            if (cursor.value.equals(value)){
                removeNode(cursor);
                return true;
            }
            cursor=cursor.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node <T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        T ruturnValue = cursor.value;
        removeNode(cursor);
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor=cursor.next;
        }
        return cursor.value;
    }

    @Override
    public T getFirst() {
        if (first == null) {return null;}
        return first.value;
    }

    @Override
    public T getLast() {
        if (last == null){
            if (first == null){return null;}
            else {return first.value;}
        }
        return last.value;
    }

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor=cursor.next;
        }
        cursor.value=value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append(", ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }

        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void addLast(T value) {
        add(value);
    }


    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

    }
}
