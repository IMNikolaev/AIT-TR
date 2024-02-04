package lesson_04;

class Letter {
    private char lowercaseChar;

    public Letter(char lowercaseChar) {
        this.lowercaseChar = lowercaseChar;
    }

    public char toUppercase() {
        return (char) (lowercaseChar - 'a' + 'A');
    }
}

public class NameConverter {
    public static void main(String[] args) {
        Letter letter1 = new Letter('и');
        Letter letter2 = new Letter('г');
        Letter letter3 = new Letter('о');
        Letter letter4 = new Letter('р');
        Letter letter5 = new Letter('ь');

        System.out.print(letter1.toUppercase());
        System.out.print(letter2.toUppercase());
        System.out.print(letter3.toUppercase());
        System.out.print(letter4.toUppercase());
        System.out.println(letter5.toUppercase());
    }
}