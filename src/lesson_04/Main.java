package lesson_04;

public class Main {
    public static void main(String[] args) {

        //Задание 1

        String name = "Игорь";
        System.out.println("Задание 1: (Длина строки) " + name.length());
        char first = name.charAt(0);
        char last = name.charAt(name.length()-1);
        System.out.println("Задание 1: (Первый символ ) " + first);
        System.out.println("Задание 1: (Последний символ ) " + last);
        System.out.println("Задание 1: (Последний символ десятичный код ) " + (int)first);
        System.out.println("Задание 1: (Последний символ десятичный код ) " + (int)last + "\n");


        //Задание 2

        String Java =  "Java";
        String is = "is";
        String a = "a";
        String powerful = "powerful";
        String language = "language";

        String line = Java + " " + is + " " + a + " " + powerful + " " + language;
        System.out.println("Задание 2: (Конкатенация строк) " + line);

        String line1 = Java.concat(" ").concat(is).concat(" ").concat(a).concat(" ").concat(powerful).concat(" ").concat(language);
        System.out.println("Задание 2: (concat()) " + line1);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java");
        stringBuilder.append(" ");
        stringBuilder.append("is");
        stringBuilder.append(" ");
        stringBuilder.append("a");
        stringBuilder.append(" ");
        stringBuilder.append("powerful");
        stringBuilder.append(" ");
        stringBuilder.append("language");
        String line2 = stringBuilder.toString();
        System.out.println("Задание 2: (StringBuilder) " + line2);

        //Задание 2.2

        String replaceLine = line.replace("powerful", "super");
        System.out.println("Задание 2.2: (Замена слова в строке) " + replaceLine);

        boolean indicator = line.matches(".*\\bage\\b.*");
        if (indicator) {
            System.out.println("Задание 2.2: Cлово найдено!" + "\n");
        } else {
            System.out.println("Задание 2.2: Cлово не найдено!" + "\n");
        }

        //Задание 3

        String one = "string";
        String two = "code";
        String three = "Practice";

        int lengthOne = one.length();
        int lengthTwo = two.length();
        int lengthThree = three.length();

        System.out.println("Задание 3: (Два средних символа строки string) " + String.valueOf(one.charAt((lengthOne/2)-1)) + String.valueOf(one.charAt((lengthOne/2))));
        System.out.println("Задание 3: (Два средних символа строки code) " + String.valueOf(two.charAt((lengthTwo/2)-1)) + String.valueOf(two.charAt((lengthTwo/2))));
        System.out.println("Задание 3: (Два средних символа строки Practice) " + String.valueOf(three.charAt((lengthThree/2)-1)) + String.valueOf(three.charAt((lengthThree/2))));

        char i = 'i';
        char g = 'g';
        char o = 'o';
        char r = 'r';

        char I = Character.toUpperCase(i);
        char G = Character.toUpperCase(g);
        char O = Character.toUpperCase(o);
        char R = Character.toUpperCase(r);

        System.out.println( String.valueOf(I)+ String.valueOf(G)+ String.valueOf(O)+ String.valueOf(R));

        char I1 = (char) (i - 32);
        char G1 = (char) (g - 32);
        char O1 = (char) (o - 32);
        char R1 = (char) (r - 32);

        System.out.println( String.valueOf(I1)+ String.valueOf(G1)+ String.valueOf(O1)+ String.valueOf(R1));

        System.out.println("" + I1 + G1 + O1 + R1);

        System.out.println(("" + i + g + o + r).toUpperCase());

        System.out.println((String.valueOf(i)+ String.valueOf(g)+ String.valueOf(o)+ String.valueOf(r)).toUpperCase());

        }
}

