package lesson_38.Task1;

public class Main {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        Sorted sorted = new Sorted();
        System.out.println(sorted.getUniqueSortedWords(testString));
    }
}
